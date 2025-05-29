package com.coderaviverma.springtestDummy.java.designpatterns.abstractfactory;

public class StripeUPIPayment implements UPIPayment {
    @Override
    public void pay(String upiId, double amount) {
        System.out.println("Payment from Stripe " + upiId + " amount " + amount);
    }
}
