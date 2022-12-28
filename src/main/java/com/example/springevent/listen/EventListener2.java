package com.example.springevent.listen;

import com.example.springevent.event.UserRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener2 {
    @EventListener
    public void register(UserRegisterEvent event) {
        System.out.println("注解事件监听：" + event.getUser().getName());
    }
}
