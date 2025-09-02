package com.works.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Profile("dev")
public class Dev implements IConfig{

    @Override
    public Map<String, Object> config() {
        Map<String, Object> map = new HashMap<>();
        map.put("apiKey", "devKeyApi12eqweweq");
        map.put("apiSecret", "devKeyApi12eqweweq");
        map.put("count", 50);
        map.put("status", true);
        return map;
    }

}
