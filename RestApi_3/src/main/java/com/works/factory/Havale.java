package com.works.factory;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("havale")
@Order(value = 2)
public class Havale implements IPay {

    @Override
    public void pay() {
        System.out.println("Havale pay");
    }

}
