package com.works.factory;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("paypal")
@Order(value = 3)
public class PayPal implements IPay {

    @Override
    public void pay() {
        System.out.println("PayPal pay");
    }

}
