package com.works.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Profile("prod")
public class Prod implements IConfig{

    @Override
    public Map<String, Object> config() {
        Map<String, Object> map = new HashMap<>();
        map.put("apiKey", "prodKeyApi12eqweweq");
        map.put("apiSecret", "proKeyApi12eqweweq");
        map.put("count", 40);
        map.put("status", false);
        return map;
    }

}