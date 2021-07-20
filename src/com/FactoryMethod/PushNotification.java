package com.FactoryMethod;

public class PushNotification implements Notification{

    @Override
    public void notifyUser () {
        System.out.println("We are sending push notification");
    }
}
