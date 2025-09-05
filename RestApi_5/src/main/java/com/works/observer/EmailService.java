package com.works.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @EventListener
    public void handleNewOrderCreated(NewOrderCreatedEvent event) {
        System.out.println("Sipariş onayı e-postası gönderiliyor: ");
    }

}