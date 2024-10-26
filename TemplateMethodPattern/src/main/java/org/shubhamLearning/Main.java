package org.shubhamLearning;

import TemplateMethodPattern.Impl.PaypalPaymentGateway;
import TemplateMethodPattern.Impl.StripePaymentGateway;
import TemplateMethodPattern.TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {
         TemplateMethodPattern templateMethodPattern = new PaypalPaymentGateway();
         /*
            If we see the output of this we see a sequence of method calls which happened
             this is what Template Method Pattern is giving us a sequence of method
             which will become a skeleton for an algorithm here algorithm is nothing but dpPayment()
          */
         templateMethodPattern.doPayment();

        System.out.println("\n****************** STRIPE PAYMENT GATEWAY ****************************\n");

         templateMethodPattern = new StripePaymentGateway();
         templateMethodPattern.doPayment();

    }
}