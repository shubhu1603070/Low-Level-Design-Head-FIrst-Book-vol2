package org.shubhamLearning.FactoryPattern.PaymentFactory.Impl;

import org.shubhamLearning.FactoryPattern.Payment.Impl.CreditCardPayment;
import org.shubhamLearning.FactoryPattern.Payment.Impl.DebitCardPayment;
import org.shubhamLearning.FactoryPattern.Payment.Payment;
import org.shubhamLearning.FactoryPattern.PaymentFactory.PaymentFactory;
import org.shubhamLearning.FactoryPattern.PaymentType.PaymentType;

public class CardPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment(PaymentType paymentType) {
        if(paymentType.equals(PaymentType.CREDIT))
            return new CreditCardPayment();
        if(paymentType.equals(PaymentType.DEBIT))
            return new DebitCardPayment();
        return null;
    }
}
