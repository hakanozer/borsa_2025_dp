package com.works.liskov;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class Iphone implements IProduct{

    @Value("${product.pers}")
    private int productPers;

    int customer = 100;
    int ads = 150;

    @Override
    public int price() {
        return 75000+ customer + ads + productPers;
    }

}
