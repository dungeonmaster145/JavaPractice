package com.FactoryPattern;

public class EmailNotification implements Notification{

    @Override
    public String notifyUser (String notificationType) {
        return notificationType;
    }
}
