package com.works.adapter;

import org.springframework.stereotype.Service;

@Service
public class FedexApi implements TrackingService {

    String fedexStrin = "Fedex";

    @Override
    public String track(String trackNumber) {
        fedexSend();
        return "";
    }

    public void fedexSend() {
        System.out.println("fedex Send");
    }

}
