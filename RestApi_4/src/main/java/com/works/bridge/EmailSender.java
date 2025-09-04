package com.works.bridge;

import org.springframework.stereotype.Component;

@Component("emailSender")
public class EmailSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("Sending email to: " + message);
    }

}
