package com.works.configs;

import com.works.prototype.Admin;
import com.works.repositories.AdminRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Random;

@Configuration
public class AppBeans {

    @Bean("rnd_1")
    public Random a(HttpServletRequest req) {
        System.out.println("Random Çalıştı");
        return new Random();
    }

    @Bean("rnd_2")
    public Random b(Random rnd_1) {
        Random rnd = new Random(100);
        return rnd;
    }

    @Bean
    @Scope("prototype")
    public Integer getRandom() {
        Random rnd = new Random();
        int result = rnd.nextInt(10);
        System.out.println(result);
        return result;
    }

    @Bean
    @Scope("prototype")
    public Admin getAdmin( AdminRepository adminRepository ) {
        Admin admin = new Admin();
        admin.setUsername("Kemal");
        admin.setPassword("Kemal12345");
        admin.setEmail("kemal@mail.com");
        return admin;
    }

}
