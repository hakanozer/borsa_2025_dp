package com.works.bridge;

import org.springframework.stereotype.Component;

@Component("smsSender")
public class SmsSender implements NotificationSender{

    @Override
    public void send(String message) {
        System.out.println("Sms email to: " + message);
    }

}
