package com.FactoryMethod;

public class SMSNotifaction implements Notification {

    @Override
    public void notifyUser () {
        System.out.println("Sending the Email Notification");
    }
}
