package com.coderaviverma.springtestDummy.java.designpatterns.factory;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Email notified");
    }
}
