package com.springboot.learn.Dec172025;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycle {

    @Autowired
    Order order;
    public BeanLifecycle(){
        System.out.println("inside eagerly initialization");
    }
    @PostConstruct
    public void post(){
        System.out.println("post construct of beanlifecycle");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("inside destroy");
    }


}
