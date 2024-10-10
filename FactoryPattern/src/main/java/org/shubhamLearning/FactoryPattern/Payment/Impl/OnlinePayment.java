package org.shubhamLearning.FactoryPattern.Payment.Impl;

import org.shubhamLearning.FactoryPattern.Payment.Payment;

public class OnlinePayment extends Payment {
    @Override
    public void checkAccount() {
        System.out.println("Payment is processed from : "+this.getClass().getName());
        System.out.println("Check for the account balance for Customer A");
    }

    @Override
    public void deductAccount() {
        System.out.println("Deduct money from the Customer A");
    }

    @Override
    public void depositAccount() {
        System.out.println("Deposit money from Customer A to Customer B");
    }

    @Override
    public void updateAccount() {
        System.out.println("Update the Account for customer A if everything goes fine");
    }
}
