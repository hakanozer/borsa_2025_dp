package com.works.adapter;

import org.springframework.stereotype.Service;

@Service
public class ArasApi implements TrackingService {

    @Override
    public String track(String trackNumber) {
        System.out.println("ArasApi.track");
        return "ArasApi Send";
    }

}
