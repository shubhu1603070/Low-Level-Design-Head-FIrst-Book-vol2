package org.shubhamLearning.subsystems;

import java.util.ArrayList;
import java.util.List;

public class Account {

    static List<Integer> moneyInAccount = new ArrayList<>();
    static {
        moneyInAccount.add(1000);
        moneyInAccount.add(9000);
        moneyInAccount.add(343);
    }
    public int getAccount(int userId){
        return moneyInAccount.get(userId);
    }

    public void deductMoney(int userId, int amount){
        moneyInAccount.set(userId,moneyInAccount.get(userId)-amount);
    }

    public void depositMoney(int userId, int amount){
        moneyInAccount.set(userId,moneyInAccount.get(userId)+amount);
    }

    public boolean checkAccount(int userId,int amount){
        return moneyInAccount.get(userId) > amount;
    }

}
