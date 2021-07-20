package com.FactoryPattern;

import java.util.Scanner;

public class NotificationService {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="SMS";

        NotificationFactory notificationFactory=new NotificationFactory();

        Notification notification=notificationFactory.Factory("SMS");
        System.out.println(notification.notifyUser(s));
    }
}
