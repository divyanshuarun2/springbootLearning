package com.springboot.learn.Dec152025;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public User2 user2(){
        return new User2("email2","username2");
    }
}
