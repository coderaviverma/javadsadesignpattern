package com.coderaviverma.springtestDummy.java.designpatterns.abstractfactory;

public class PaypalPaymentFactory implements PaymentGatewayFactory{
    @Override
    public UPIPayment createUpiPayment() {
        return new PaypalUPIPayment();
    }

    @Override
    public CreditCardPayment createCreditCardPayment() {
        return new PaypalCreditCardPayment();
    }
}
