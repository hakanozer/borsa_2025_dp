package com.works.useAbstract;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("digitalWallet")
public class DigitalWalletPaymentFactory implements PaymentProcessorFactory {

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new DigitalWalletProcessor();
    }

    @Override
    public PaymentValidator createPaymentValidator() {
        return new DigitalWalletValidator();
    }

    @Override
    public PaymentNotifier createPaymentNotifier() {
        return null;
    }
}
