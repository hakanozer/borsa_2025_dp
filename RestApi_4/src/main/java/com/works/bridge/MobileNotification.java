package com.works.bridge;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MobileNotification extends Notification {

    public MobileNotification(@Qualifier("smsSender") NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    public void send(String message) {
        notificationSender.send(message);
    }

}
