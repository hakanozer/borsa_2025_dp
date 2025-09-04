package com.works.decorator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderControl extends OrderProcessDecorator {

    public OrderControl(@Qualifier("simpleOrderProcess") OrderProcess process) {
        super(process);
    }

    @Override
    public void process(OrderRequest orderRequest) {
        super.process(orderRequest);
        System.out.println("OrderControl Order Process");
    }

}
