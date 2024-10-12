package org.shubhamLearning.VendorClasses.Monitor;

public interface Monitor {

    default void setInputChannel(String channel){
        System.out.println("Setting input to "+channel);
    }

    default void setVolume(int volume){
        System.out.println("Setting volume to "+volume);
    }
}
