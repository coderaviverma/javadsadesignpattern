package com.coderaviverma.springtestDummy.java.designpatterns.abstractfactory;

public class PaypalUPIPayment implements UPIPayment {
    @Override
    public void pay(String upiId, double amount) {
        System.out.println("Payment from Paypal UPI " + upiId + " amount " + amount);
    }
}
