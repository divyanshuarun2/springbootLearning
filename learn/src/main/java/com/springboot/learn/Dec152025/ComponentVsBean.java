package com.springboot.learn.Dec152025;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class ComponentVsBean {


        // we will create 2 bean (java object) one with component and one with bean
        @Autowired
        User1 user1;
        public void run1() {
            user1.setUsername("user1");
            user1.setEmail("email1");

            System.out.println(user1.getEmail() + "; " + user1.getUsername());
        }

/* Here dependency cycle is created...
    @Bean
    public User2 user2(){
        return new User2("email2","username2");
    } */

        @Autowired
        User2 user2;
        public void run2(){
            System.out.println(user2.getEmail2()+";;"+user2.getUsername2());
            System.out.println();

        }
}
