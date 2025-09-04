package com.works.decorator;

abstract public class OrderProcessDecorator implements OrderProcess {

    final public OrderProcess process;
    public OrderProcessDecorator(OrderProcess process) {
        this.process = process;
    }

    @Override
    public void process(OrderRequest orderRequest) {
        process.process(orderRequest);
    }


}
