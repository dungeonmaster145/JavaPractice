package com.FactoryMethod;

import java.util.Optional;

public class MAINCLASS {

    public static void main (String[] args) {
        NotificationFactory notificationFactory=new NotificationFactory();
        Notification notification=notificationFactory.FactoryIMplement("Push");
        notification.notifyUser();


    }
}
