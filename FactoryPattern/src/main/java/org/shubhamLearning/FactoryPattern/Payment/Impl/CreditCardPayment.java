package org.shubhamLearning.FactoryPattern.Payment.Impl;

import org.shubhamLearning.FactoryPattern.Payment.Payment;

public class CreditCardPayment extends Payment {
    @Override
    public void checkAccount() {
        System.out.println("Payment is processed from : "+this.getClass().getName());
        System.out.println("Check card limit for Customer A");
    }

    @Override
    public void deductAccount() {
        System.out.println("Deduct money from the Customer A's card");
    }

    @Override
    public void depositAccount() {
        System.out.println("Deposit money from Customer A's card to Customer B");
    }

    @Override
    public void updateAccount() {
        System.out.println("Update the amount for customer A's card if everything goes fine");
    }
}
