package com.coderaviverma.springtestDummy.java.designpatterns.factory;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("SMS notification");
    }
}
