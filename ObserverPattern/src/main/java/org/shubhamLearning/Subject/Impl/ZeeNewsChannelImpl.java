package org.shubhamLearning.Subject.Impl;

import org.shubhamLearning.Observer.Interface.User;
import org.shubhamLearning.Subject.Interface.NewsChannel;
import java.util.ArrayList;
import java.util.List;

/*
    Here ZeeNews is continuously producing the news as soon as it gets any news
    And Any number of Users can subscribe to ZeeNewsChannelImpl

    Suppose it's Out Data Source Number 3
*/

public class ZeeNewsChannelImpl implements NewsChannel {

    List<User> userList = new ArrayList<User>();
    String newNews;

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public void notifyUser() {
        for(User user : userList){
            user.update();
        }
    }

    public void setChannelUpdate(String newNews) {
        this.newNews = newNews;
        notifyUser();
    }

    public String getChannelUpdate() {
        return this.newNews;
    }
}
