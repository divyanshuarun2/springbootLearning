package com.springboot.learn.Dec172025;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Order {
    public Order(){
        System.out.println("inside component lazy loading");
    }
}
