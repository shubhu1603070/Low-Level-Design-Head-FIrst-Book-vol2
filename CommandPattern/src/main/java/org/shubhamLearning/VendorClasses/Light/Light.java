package org.shubhamLearning.VendorClasses.Light;

public interface Light{

    default void brightNess(){
        System.out.println("BrightNess is @ : 100%");
    }

    public abstract void on();
    public abstract void off();
}
