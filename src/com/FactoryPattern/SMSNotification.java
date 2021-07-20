package com.FactoryPattern;

public class SMSNotification implements Notification {

    @Override
    public String notifyUser (String notificationType) {
        return notificationType;
    }
}
