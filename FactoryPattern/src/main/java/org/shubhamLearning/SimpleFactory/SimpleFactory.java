package org.shubhamLearning.SimpleFactory;

import java.util.Objects;

public class SimpleFactory {


    public void doCashPayment(){
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment payment = paymentFactory.createPayment(PaymentType.CASH);
        payment.printMessage();
    }

    public void doCardPayment(){
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment payment = paymentFactory.createPayment(PaymentType.CARD);
        payment.printMessage();
    }

    public void doOnlinePayment(){
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment payment = paymentFactory.createPayment(PaymentType.ONLINE);
        payment.printMessage();
    }


    public abstract static class Payment{
        public abstract void printMessage();
    }

    public static class CashPayment extends Payment{

        @Override
        public void printMessage() {
            System.out.println("CASH payment");
        }
    }

    public static class CardPayment extends Payment{

        @Override
        public void printMessage() {
            System.out.println("CARD payment");
        }
    }

    public static class OnlinePayment extends Payment{

        @Override
        public void printMessage() {
            System.out.println("Online payment");
        }
    }

    //Simple Factory Method all @ one place
    public static class PaymentFactory{
        public Payment createPayment(PaymentType paymentType) {
            if(paymentType.equals(PaymentType.CASH))
                return new CashPayment();
            else if(paymentType.equals(PaymentType.CARD))
                return new CardPayment();
            else if(paymentType.equals(PaymentType.ONLINE))
                return new OnlinePayment();
            return null;
        }
    }

    public enum PaymentType{
        CASH,
        CARD,
        ONLINE
    }

}