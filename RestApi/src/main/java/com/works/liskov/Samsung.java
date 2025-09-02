package com.works.liskov;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class Samsung implements  IProduct{

    @Value("${product.pers}")
    private int productPers;

    int customer = 80;

    @Override
    public int price() {
        return 75000+ customer  + productPers;
    }

}
