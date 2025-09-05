package com.works.observer;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @EventListener
    public void handleNewOrderCreated(NewOrderCreatedEvent event) {
        System.out.println("Sipariş için stok düşürülüyor: ");
    }

}
