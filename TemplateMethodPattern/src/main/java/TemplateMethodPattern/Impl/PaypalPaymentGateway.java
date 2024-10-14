package TemplateMethodPattern.Impl;

import TemplateMethodPattern.TemplateMethodPattern;

public class PaypalPaymentGateway extends TemplateMethodPattern {
    @Override
    protected void transferMoney() {
        System.out.println("Money is transferred using Paypal Payment Gateway");
    }

    @Override
    protected void updateCustomer() {
        System.out.println("User is updated when payment was done from Paypal Gateway");
    }
}
