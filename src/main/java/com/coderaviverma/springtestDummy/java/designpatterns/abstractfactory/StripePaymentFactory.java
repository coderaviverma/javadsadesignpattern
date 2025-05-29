package com.coderaviverma.springtestDummy.java.designpatterns.abstractfactory;

public class StripePaymentFactory implements PaymentGatewayFactory{
    @Override
    public UPIPayment createUpiPayment() {
        return new StripeUPIPayment();
    }

    @Override
    public CreditCardPayment createCreditCardPayment() {
        return new StripeCreditCardPayment();
    }
}
