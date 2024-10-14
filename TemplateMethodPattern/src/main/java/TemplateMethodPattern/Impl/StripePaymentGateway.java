package TemplateMethodPattern.Impl;

import TemplateMethodPattern.TemplateMethodPattern;

public class StripePaymentGateway extends TemplateMethodPattern {
    @Override
    protected void transferMoney() {
        System.out.println("Money is transferred using Stripe Payment Gateway");
    }

    @Override
    protected void updateCustomer() {
        System.out.println("User is updated when payment was done from Stripe Gateway");
    }

    //In Stripe, I have a requirement of sending text to customer whenever any transaction occurs
    //Hook Method implemented here bcuz it was needed
    @Override
    protected void sendMessage() {
        System.out.println("Message send after the payment was done from Stripe Gateway");
    }
}
