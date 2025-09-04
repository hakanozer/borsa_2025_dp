package com.works.adapter;

import org.springframework.stereotype.Service;

@Service
public class UpsApi implements TrackingService {

    String upsString = "UPS";

    @Override
    public String track(String trackNumber) {
        send();
        return "";
    }

    public void send() {
        System.out.println("Sending UPS");
    }

}
