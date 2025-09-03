package com.works.useAbstract;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("creditCard")
public class CreditCardPaymentFactory implements PaymentProcessorFactory {

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CreditCardProcessor();
    }

    @Override
    public PaymentValidator createPaymentValidator() {
        return new CreditCardValidator();
    }

    @Override
    public PaymentNotifier createPaymentNotifier() {
        return new EmailNotifier();
    }
}
