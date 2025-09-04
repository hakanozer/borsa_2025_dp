package com.works.decorator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StockControl extends OrderProcessDecorator {

    public StockControl(@Qualifier("simpleOrderProcess") OrderProcess process) {
        super(process);
    }

    @Override
    public void process(OrderRequest orderRequest) {
        super.process(orderRequest);
        System.out.println("StockControl Order Process");
    }

}
