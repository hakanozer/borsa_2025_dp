package com.works.restcontrollers;

import com.works.liskov.IProduct;
import com.works.profile.IConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("profile")
@RequiredArgsConstructor
public class ProfileRestController {

    final private IConfig iConfig;
    final IProduct iProduct;

    @GetMapping("data")
    public Map getConfig() {
        Map map = iConfig.config();
        map.put("price", iProduct.price() );
        return map;
    }

}
