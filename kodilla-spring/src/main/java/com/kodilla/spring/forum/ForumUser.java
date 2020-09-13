package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String userName;
    public ForumUser(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return "john";
    }
}

