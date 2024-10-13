package org.shubhamLearning;

import org.shubhamLearning.facade.FacadeInterface;
import org.shubhamLearning.subsystems.Account;
import org.shubhamLearning.subsystems.UserInfo;

public class Main {
    public static void main(String[] args) {


        //Now let's say we're client and want to use the services provided by company XYZ.

        Account account = new Account();
        UserInfo userInfo = new UserInfo();

        FacadeInterface facadeInterface = new FacadeInterface(account,userInfo);

        //If the customer B whom we're sending money is from the same bank
        String transaction1 = facadeInterface.doPayment(1, 2, 300);
        System.out.println(transaction1);

        //If the customer is not from the bank whom we're sending money to
        String transaction2 = facadeInterface.doPayment(2, 3, 300);
        System.out.println(transaction2);

        //If the customer B whom we're sending money is from the same bank
        String transaction3 = facadeInterface.doPayment(2, 1, 300);
        System.out.println(transaction3);

    }
}