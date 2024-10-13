package org.shubhamLearning.facade;

import org.shubhamLearning.subsystems.Account;
import org.shubhamLearning.subsystems.UserInfo;

public class FacadeInterface {

    Account account;
    UserInfo userInfo;

    public FacadeInterface(Account account, UserInfo userInfo) {
        this.account = account;
        this.userInfo = userInfo;
    }


    public String doPayment(int aUserId,int bUserId,int amount){
        aUserId-=1;
        bUserId-=1;
        if(account.checkAccount(aUserId,amount)){
            if(userInfo.getUserInfo(bUserId).get("isCustomer").equals("YES")){
                account.deductMoney(aUserId,amount);
                account.depositMoney(bUserId,amount);
                userInfo.updateUserInfo(aUserId, String.valueOf(account.getAccount(aUserId)));
                userInfo.updateUserInfo(bUserId, String.valueOf(account.getAccount(bUserId)));
            }else{
                return "customer is not supported as not from the same bank!";
            }
        }

        return "After deduction "+(aUserId+1)+" Account Balance : "+userInfo.getUserInfo(aUserId) + " After Deposit user " + (bUserId+1) +" Account Balance "+userInfo.getUserInfo(bUserId);

    }


}
