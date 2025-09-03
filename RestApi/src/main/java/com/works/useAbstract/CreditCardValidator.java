package com.works.useAbstract;

public class CreditCardValidator implements PaymentValidator {

    @Override
    public boolean validatePayment(PaymentRequest request) {
        return false;
    }
}
