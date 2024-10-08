package org.shubhamLearning;

import org.shubhamLearning.Observer.Impl.LaptopUserImpl;
import org.shubhamLearning.Observer.Impl.MobileUserImpl;
import org.shubhamLearning.Observer.Impl.TabUserImpl;
import org.shubhamLearning.Observer.Interface.User;
import org.shubhamLearning.Subject.Impl.AajTakNewsChannelImpl;
import org.shubhamLearning.Subject.Impl.BharatNewsChannelImpl;
import org.shubhamLearning.Subject.Impl.ZeeNewsChannelImpl;
import org.shubhamLearning.Subject.Interface.NewsChannel;

public class Main {
    public static void main(String[] args) {
        //Data source 1
        NewsChannel aajTakNewsChannel = new AajTakNewsChannelImpl();

        //Data source 2
        NewsChannel bharatNewsChannel = new BharatNewsChannelImpl();

        //Data source 3
        NewsChannel zeeNewsChannel = new ZeeNewsChannelImpl();

        //A single type of user can subscribe to multiple data sources
        User laptopUser = new LaptopUserImpl(aajTakNewsChannel);
        User laptopUser2 = new LaptopUserImpl(bharatNewsChannel);

        //Multiple type of users can subscribe to single data source
        User mobileUser = new MobileUserImpl(aajTakNewsChannel);
        User mobileUser2 = new MobileUserImpl(bharatNewsChannel);

        //A Single type of user can subscribe to single data source
        User tabUser = new TabUserImpl(zeeNewsChannel);


        aajTakNewsChannel.addUser(laptopUser);
        aajTakNewsChannel.addUser(mobileUser);

        bharatNewsChannel.addUser(laptopUser2);
        bharatNewsChannel.addUser(mobileUser);

        zeeNewsChannel.addUser(tabUser);

        System.out.println("\n*********************** AajTak news channel have published news ***********************");
        aajTakNewsChannel.setChannelUpdate("India won match with 7 wicket");
        System.out.println("\n*********************** bharat news channel have published news ***********************");
        bharatNewsChannel.setChannelUpdate("SriLanka lost match with 7 wickets");
        System.out.println("\n*********************** zee news channel have published news ***********************");
        zeeNewsChannel.setChannelUpdate("India won match with 7 wicket and 13 runs");

        //Now suppose if aajTakNewsChannel one more news but mobileUser have unsubscribed the aajTakNewsChannel
        aajTakNewsChannel.removeUser(mobileUser);
        System.out.println("\n*********************** AajTak news channel have publishing news ***********************");
        aajTakNewsChannel.setChannelUpdate("India was placed 1st in international women's cricket club");
    }
}