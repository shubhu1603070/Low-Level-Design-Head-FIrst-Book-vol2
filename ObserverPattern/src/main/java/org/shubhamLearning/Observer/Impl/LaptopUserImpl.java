package org.shubhamLearning.Observer.Impl;

import org.shubhamLearning.Observer.Interface.User;
import org.shubhamLearning.Subject.Interface.NewsChannel;
/*

    The user needs to know from which data source it's getting the news from show they can be sure that
    which channel have shown what shows or news

 */


public class LaptopUserImpl implements User {

    private NewsChannel newsChannel;

    public LaptopUserImpl(NewsChannel newsChannel) {
        this.newsChannel = newsChannel;
    }

    public void update() {
        System.out.println(this.getClass().getName()+" We got news : "+newsChannel.getChannelUpdate()+ " from : "+newsChannel.getClass().getName());
    }
}
