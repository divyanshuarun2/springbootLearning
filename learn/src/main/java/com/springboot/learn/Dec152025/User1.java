package com.springboot.learn.Dec152025;

import org.springframework.stereotype.Component;

@Component
public class User1 {
    private String email;
    private String username;

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
