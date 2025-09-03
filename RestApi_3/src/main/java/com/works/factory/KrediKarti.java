package com.works.factory;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("krediKarti")
@Order(value = 1)
public class KrediKarti implements IPay {

    @Override
    public void pay() {
        System.out.println("KrediKarti pay");
    }

}

