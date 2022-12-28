package com.example.springevent.event;

import com.example.springevent.domain.User;
import org.springframework.context.ApplicationEvent;

public class UserRegisterEvent extends ApplicationEvent {
    private User user;

    public UserRegisterEvent(Object source, User user) {
        super(source);
        this.user = user;
    }

    public User getUser(){
        return user;
    }
}
