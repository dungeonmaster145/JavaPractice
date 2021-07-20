package com.FactoryMethod;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser () {

        System.out.println("We send the EmailNotification");
    }
}
