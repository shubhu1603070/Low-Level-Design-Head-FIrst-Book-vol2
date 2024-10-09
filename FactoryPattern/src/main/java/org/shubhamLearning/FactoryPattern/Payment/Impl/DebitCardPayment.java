package org.shubhamLearning.FactoryPattern.Payment.Impl;

import org.shubhamLearning.FactoryPattern.Payment.Payment;

public class DebitCardPayment extends Payment {
    @Override
    public void checkAccount() {
        System.out.println("Payment is processed from : "+this.getClass().getName());
        System.out.println("Check Amount in Customer A Account");
    }

    @Override
    public void deductAccount() {
        System.out.println("Deduct money from the Customer A's Account");
    }

    @Override
    public void depositAccount() {
        System.out.println("Deposit money from Customer A's Account to Customer B");
    }

    @Override
    public void updateAccount() {
        System.out.println("Update the amount for customer A's Account if everything goes fine");
    }
}
