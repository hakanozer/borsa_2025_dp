package com.works.services;

import com.works.repositories.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final AdminRepository adminRepository;
    private final Random rnd_2;
    private ApplicationContext applicationContext;

    public void rnd() {
        Random rnd_1 = (Random) applicationContext.getBean("rnd_1");
        System.out.println(rnd_2.nextInt());
    }

}
