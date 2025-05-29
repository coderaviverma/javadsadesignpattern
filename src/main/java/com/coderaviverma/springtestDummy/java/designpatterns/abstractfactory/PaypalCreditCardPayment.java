package com.coderaviverma.springtestDummy.java.designpatterns.abstractfactory;

public class PaypalCreditCardPayment implements CreditCardPayment{
    @Override
    public void pay(double amount) {
        System.out.println("Payment from Paypal UPI amount " + amount);

    }
}
