package com.works.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Profile("test")
public class Test implements IConfig{

    @Override
    public Map<String, Object> config() {
        Map<String, Object> map = new HashMap<>();
        map.put("apiKey", "testKeyApi12eqweweq");
        map.put("apiSecret", "testKeyApi12eqweweq");
        map.put("count", 40);
        map.put("status", false);
        return map;
    }

}