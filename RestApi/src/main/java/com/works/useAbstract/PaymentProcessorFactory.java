package com.works.useAbstract;

// Abstract Factory Interface
public interface PaymentProcessorFactory {
    PaymentProcessor createPaymentProcessor();
    PaymentValidator createPaymentValidator();
    PaymentNotifier createPaymentNotifier();
}
