package com.coderaviverma.springtestDummy.java.designpatterns.factory;

public class MainFactoryDemo {

    public static void main(String[] args) {

        Notification notification = NotficationFactory.createNotification("call");
        notification.notifyUser();

    }
}
