package com.coderaviverma.springtestDummy.java.designpatterns.factory;

public class CallNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Call Notification");
    }
}
