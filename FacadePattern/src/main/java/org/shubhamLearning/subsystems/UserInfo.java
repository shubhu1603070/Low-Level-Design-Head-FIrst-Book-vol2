package org.shubhamLearning.subsystems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfo {

    static Map<Integer, Map<String,String>> userInformation = new HashMap<>();

    static {

        userInformation.put(0,Map.of("userName","X","accountBalance","1000","isCustomer","YES"));
        userInformation.put(1,Map.of("userName","Y","accountBalance","9000","isCustomer","YES"));
        userInformation.put(2,Map.of("userName","Z","accountBalance","343","isCustomer","NO"));
    }


    public Map<String,String> getUserInfo(int userId){
        return userInformation.get(userId);
    }

    public void updateUserInfo(int userId,String amount){
        Map<String, String> user = userInformation.get(userId);
        Map<String,String> userInfo = new HashMap<>(user);
        userInfo.put("accountBalance",amount);
        userInformation.put(userId,userInfo);
    }


}
