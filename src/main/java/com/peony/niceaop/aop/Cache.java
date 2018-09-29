package com.peony.niceaop.aop;

import jdk.internal.instrumentation.TypeMapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 启用缓存的注解
 * value = "redis" ,默认 缓存到redis,从redis获取
 * value = "ehcache" 缓存到ehcache,从ehcache获取
 */
@Target(ElementType.METHOD)
public @interface Cache {

    String value() default "redis";

    Class resultClass();
}
