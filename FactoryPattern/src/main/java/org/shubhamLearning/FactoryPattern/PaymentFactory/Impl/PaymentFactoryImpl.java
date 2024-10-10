package org.shubhamLearning.FactoryPattern.PaymentFactory.Impl;

import org.shubhamLearning.FactoryPattern.Enums.PaymentType;
import org.shubhamLearning.FactoryPattern.Payment.Impl.CashPayment;
import org.shubhamLearning.FactoryPattern.Payment.Impl.CreditCardPayment;
import org.shubhamLearning.FactoryPattern.Payment.Impl.DebitCardPayment;
import org.shubhamLearning.FactoryPattern.Payment.Impl.OnlinePayment;
import org.shubhamLearning.FactoryPattern.Payment.Payment;
import org.shubhamLearning.FactoryPattern.PaymentFactory.PaymentFactory;

public class PaymentFactoryImpl extends PaymentFactory {
    @Override
    public Payment createPayment(PaymentType paymentType) {
        if(paymentType.equals(PaymentType.CREDIT))
            return new CreditCardPayment();
        if(paymentType.equals(PaymentType.DEBIT))
            return new DebitCardPayment();
        if(paymentType.equals(PaymentType.CASH))
            return new CashPayment();
        if(paymentType.equals(PaymentType.ONLINE))
            return new OnlinePayment();
        return null;
    }
}
