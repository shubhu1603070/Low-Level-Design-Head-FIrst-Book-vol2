package org.shubhamLearning;

import org.shubhamLearning.FactoryPattern.PaymentFactory.Impl.CardPaymentFactory;
import org.shubhamLearning.FactoryPattern.PaymentFactory.Impl.OtherPaymentFactory;
import org.shubhamLearning.FactoryPattern.PaymentFactory.PaymentFactory;
import org.shubhamLearning.FactoryPattern.PaymentType.PaymentType;
import org.shubhamLearning.SimpleFactory.SimpleFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n*********** SIMPLE FACTORY PATTERN ***********************\n");
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.doCashPayment();
        System.out.println("\n*************** ANOTHER PAYMENT **************************\n");
        simpleFactory.doCardPayment();
        System.out.println("\n*************** ANOTHER PAYMENT **************************\n");
        simpleFactory.doOnlinePayment();

        System.out.println("\n*********** STANDARD FACTORY PATTERN *********************\n");

        PaymentFactory cardPaymentFactory = new CardPaymentFactory();
        cardPaymentFactory.doPayment(PaymentType.CREDIT);
        System.out.println("\n*************** ANOTHER PAYMENT **************************\n");
        cardPaymentFactory.doPayment(PaymentType.DEBIT);
        System.out.println("\n*************** ANOTHER PAYMENT **************************\n");
        cardPaymentFactory.doPayment(PaymentType.CASH);
        System.out.println("\n*************** ANOTHER PAYMENT **************************\n");
        cardPaymentFactory = new OtherPaymentFactory();
        cardPaymentFactory.doPayment(PaymentType.CASH);
        System.out.println("\n*************** ANOTHER PAYMENT **************************\n");
        cardPaymentFactory.doPayment(PaymentType.DEBIT);
    }
}