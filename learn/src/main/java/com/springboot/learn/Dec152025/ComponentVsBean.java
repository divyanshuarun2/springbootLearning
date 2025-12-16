package com.springboot.learn.Dec152025;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class ComponentVsBean {


        // we will create 2 bean (java object) one with component and one with bean
        @Autowired
        User1 user1;
        public void run() {
            user1.setUsername("user1");
            user1.setEmail("email1");

            System.out.println(user1.getEmail() + "; " + user1.getUsername());
        }

}
