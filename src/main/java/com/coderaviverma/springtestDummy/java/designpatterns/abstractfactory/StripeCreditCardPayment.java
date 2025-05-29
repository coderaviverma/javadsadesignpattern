package com.coderaviverma.springtestDummy.java.designpatterns.abstractfactory;

public class StripeCreditCardPayment implements CreditCardPayment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment from Stripe UPI amount " + amount);

    }
}
