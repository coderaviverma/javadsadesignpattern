package com.coderaviverma.springtestDummy.java.designpatterns.factory;

import com.coderaviverma.springtestDummy.java.oops.E;

public class NotficationFactory {

    static Notification createNotification(String type){
        return switch (type) {
            case "call" -> new CallNotification();
            case "email" -> new EmailNotification();
            case "sms" -> new SMSNotification();
            default -> new EmailNotification();
        };
    }
}
