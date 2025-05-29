package com.coderaviverma.springtestDummy.java.designpatterns.abstractfactory;

public class PaymentClient {

    public static void main(String[] args) {

        PaymentGatewayFactory factory= new PaypalPaymentFactory();
        CreditCardPayment creditCardPayment = factory.createCreditCardPayment();
        creditCardPayment.pay(50);

    }
}
