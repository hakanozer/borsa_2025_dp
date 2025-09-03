package com.works.services;

import com.works.builder.Product;
import com.works.entities.BuilderProductDto;
import com.works.factory.IPay;
import com.works.prototype.Admin;
import com.works.prototype.IUser;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class PayService {

    private final Map<String, IPay> payMap;
    private final List<IPay> payList;
    private final ApplicationContext applicationContext;

    public void pay(String payType) {
        System.out.println(payList);
        IPay payObj = payMap.get(payType);
        payObj.pay();

        Product p1 = new Product().setColor("red").setName("iPhone").setSize(7).setKg(10);
        System.out.println(p1);

        BuilderProductDto p2 = BuilderProductDto.builder().size(1).name("TV").description("TV Detail").build();
        System.out.println(p2);

        Product p3 = new Product().build().setColor("blue").setSize(8).setKg(10);
        System.out.println(p3);

        BuilderProductDto p4 = BuilderProductDto.builder().kg(30).build();
        System.out.println(p4);

        Admin admin = new Admin();
        admin.setEmail("ali@mail.com");
        admin.setPassword("12345");
        admin.setUsername("ali01");
        System.out.println(admin);

        Admin adminVeli = admin.clone();
        adminVeli.setUsername("veli01");
        System.out.println(adminVeli);

        Integer i = (Integer) applicationContext.getBean("getRandom");
        System.out.println(i);

        Admin ad1 = applicationContext.getBean(Admin.class);
        System.out.println(ad1);

        Admin ad2 = ad1.clone();
        ad2.setUsername("Kenan");
        System.out.println(ad2);

    }

}
