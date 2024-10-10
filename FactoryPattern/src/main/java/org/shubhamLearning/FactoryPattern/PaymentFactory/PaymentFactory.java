package org.shubhamLearning.FactoryPattern.PaymentFactory;

import org.shubhamLearning.FactoryPattern.Enums.PaymentType;
import org.shubhamLearning.FactoryPattern.Payment.Payment;

import java.util.Objects;

public abstract class PaymentFactory {
    public Payment doPayment(PaymentType paymentType){
        Payment payment = createPayment(paymentType);

       if(Objects.nonNull(payment)){
           payment.checkAccount();
           payment.deductAccount();
           payment.depositAccount();
           payment.updateAccount();
       }else{
           System.out.println("Payment type does not exist...");
       }

        return payment;
    }
    public abstract Payment createPayment(PaymentType paymentType);
}
