package com.coderaviverma.springtestDummy.java.designpatterns.abstractfactory;

public interface PaymentGatewayFactory {

    UPIPayment createUpiPayment();
    CreditCardPayment createCreditCardPayment();
}
