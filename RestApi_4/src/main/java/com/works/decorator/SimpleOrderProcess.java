package com.works.decorator;

import org.springframework.stereotype.Component;

@Component
public class SimpleOrderProcess implements OrderProcess {

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Order Process");
    }

}
