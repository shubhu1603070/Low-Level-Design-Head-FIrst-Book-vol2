package org.shubhamLearning.FactoryPattern.Payment.Impl;

import org.shubhamLearning.FactoryPattern.Payment.Payment;

public class CashPayment extends Payment {
    @Override
    public void checkAccount() {
        System.out.println("Payment is processed from : "+this.getClass().getName());
        System.out.println("Cash Payment from Customer A");
    }

    @Override
    public void deductAccount() {
        System.out.println("Deduct money from the Customer A Cash Payment");
    }

    @Override
    public void depositAccount() {
        System.out.println("Deposit money to B's Account from Customer A's Cash Payment");
    }

    @Override
    public void updateAccount() {
        System.out.println("Return Back the left money to Customer A");
    }
}
