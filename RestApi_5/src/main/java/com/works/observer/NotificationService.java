package com.works.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @EventListener
    public void handler(NewOrderCreatedEvent event) {
        System.out.println("NotificationService call");
    }
}
