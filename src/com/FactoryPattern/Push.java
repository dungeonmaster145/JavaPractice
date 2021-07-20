package com.FactoryPattern;

public class Push implements Notification{

    @Override
    public String notifyUser (String notificationType) {
        return notificationType;
    }
}
