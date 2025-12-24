package com.springboot.learn.Dec222025;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Orders {
    Orders(){
        System.out.println("Inside order constructor");
    }
}
