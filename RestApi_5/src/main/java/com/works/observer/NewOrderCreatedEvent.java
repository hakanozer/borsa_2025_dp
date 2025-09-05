package com.works.observer;

import org.springframework.context.ApplicationEvent;

public class NewOrderCreatedEvent extends ApplicationEvent {
    private final Order order;
    public NewOrderCreatedEvent(Object source, Order order) {
        super(source);
        this.order = order;
    }
    public Order getOrder() { return order; }
}