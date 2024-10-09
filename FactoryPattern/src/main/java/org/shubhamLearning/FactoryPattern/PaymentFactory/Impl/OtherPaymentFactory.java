package org.shubhamLearning.FactoryPattern.PaymentFactory.Impl;

import org.shubhamLearning.FactoryPattern.Payment.Impl.CashPayment;
import org.shubhamLearning.FactoryPattern.Payment.Impl.OnlinePayment;
import org.shubhamLearning.FactoryPattern.Payment.Payment;
import org.shubhamLearning.FactoryPattern.PaymentFactory.PaymentFactory;
import org.shubhamLearning.FactoryPattern.PaymentType.PaymentType;

public class OtherPaymentFactory extends PaymentFactory {

    @Override
    public Payment createPayment(PaymentType paymentType) {
        if(paymentType.equals(PaymentType.CASH))
            return new CashPayment();
        if(paymentType.equals(PaymentType.ONLINE))
            return new OnlinePayment();
        return null;
    }
}
