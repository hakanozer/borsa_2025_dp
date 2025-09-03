package com.works.useAbstract;

public class PushNotifier implements PaymentValidator {
    @Override
    public boolean validatePayment(PaymentRequest request) {
        return false;
    }
}
