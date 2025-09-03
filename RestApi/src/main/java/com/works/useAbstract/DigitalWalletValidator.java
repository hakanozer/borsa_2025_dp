package com.works.useAbstract;

public class DigitalWalletValidator implements PaymentValidator{
    @Override
    public boolean validatePayment(PaymentRequest request) {
        return false;
    }
}
