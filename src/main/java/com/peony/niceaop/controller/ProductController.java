package com.peony.niceaop.controller;

import com.peony.niceaop.aop.Cache;
import com.peony.niceaop.entity.Product;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @GetMapping("get/id/{id}")
    @Cache(resultClass = Product.class)
    public Product getProduct(@PathVariable @NonNull Integer id){
        return new Product(id , "n-"+id);
    }

    @GetMapping("get/name/{name}")
    @Cache(resultClass = Product.class)
    public Product getProduct(@PathVariable @NonNull String name) {
        return new Product(3000 , name);
    }

    public Product queryProduct() {
        return null;
    }
}
