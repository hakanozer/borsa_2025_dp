package com.works.bridge;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WebNotification extends Notification {

    public WebNotification(@Qualifier("emailSender") NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    public void send(String message) {
        notificationSender.send(message);
    }

}

