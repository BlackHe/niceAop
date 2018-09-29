package com.peony.niceaop.aop;

import com.peony.niceaop.entity.Product;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class CacheManage {

    /***
     * 1.创建一个切入点，切入带有 @Cache注解的方法
     */
    @Pointcut("@annotation(com.peony.niceaop.aop.Cache)")
    public void pointCut() {

    }


    @Around("pointCut()")
    private Object roundAspect(ProceedingJoinPoint joinPoint){
        String targetName = joinPoint.getTarget().getClass().toString();
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        Method[] methods = joinPoint.getTarget().getClass().getMethods();


        System.out.println("进入环绕通知");
        Product product1 = new Product(-1000, "error Product");
        return product1;
    }
}
