package com.springboot.learn.Dec222025;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionDemo {

    @Lazy
    @Autowired
    Orders order;

    public DependencyInjectionDemo() {
        System.out.println("Inside Dependency injectionn class");
    }
}
