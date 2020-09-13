package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String userName;
    public ForumUser() {
        this.userName = userName = "john";
    }
    public String getUserName() {
        return userName;
    }
}

