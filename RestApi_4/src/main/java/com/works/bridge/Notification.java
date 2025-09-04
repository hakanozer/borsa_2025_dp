package com.works.bridge;

public abstract class Notification {

    public NotificationSender notificationSender;
    public Notification(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public abstract void send(String message);

}
