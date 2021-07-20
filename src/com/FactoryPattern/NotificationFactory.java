package com.FactoryPattern;

public class NotificationFactory {

    public Notification Factory(String notificationType)
    {
        if(notificationType==null || notificationType.isEmpty())
            return null;

        if("SMS".equals(notificationType))
        return new SMSNotification();
        else if("Email".equals(notificationType))
            return new EmailNotification();
        else if("Push".equals(notificationType))
            return new Push();

        return null;
    }
}
