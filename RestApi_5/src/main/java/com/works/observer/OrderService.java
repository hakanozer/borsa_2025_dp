package com.works.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final ApplicationEventPublisher eventPublisher;

    @Autowired
    public OrderService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public Order createNewOrder() {
        //Order order = saveToDatabase(request);
        System.out.println("OrderService::createNewOrder");
        // Olayı yayınla, kimin dinlediğiyle ilgilenme
        eventPublisher.publishEvent(new NewOrderCreatedEvent(this, null));
        return null;
    }
}