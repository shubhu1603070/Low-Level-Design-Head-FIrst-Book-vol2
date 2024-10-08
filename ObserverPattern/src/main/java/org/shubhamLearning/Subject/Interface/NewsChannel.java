package org.shubhamLearning.Subject.Interface;


/*

    We can have more than one news Channel / Data source
    So we create one interface which can be used by multiple data source.

 */

import org.shubhamLearning.Observer.Interface.User;

public interface NewsChannel {
    void addUser(User user);
    void removeUser(User user);
    void notifyUser();

    void setChannelUpdate(String message);

    String getChannelUpdate();
}
