package com.FactoryMethod;

public class NotificationFactory {

    public Notification FactoryIMplement(String s){
        if(s==null || s.isEmpty())
            return null;
        else if("SMS".equalsIgnoreCase(s))
            return new SMSNotifaction();
        else if("PUSH".equalsIgnoreCase(s))
            return new PushNotification();
        else if("Email".equalsIgnoreCase(s))
            return new EmailNotification();

        return null;
    }
}
