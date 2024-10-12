package org.shubhamLearning.VendorClasses.Monitor;

import org.shubhamLearning.VendorClasses.Vendor;

public class DrawingRoomMonitor implements Vendor,Monitor {

    @Override
    public void on() {
        System.out.println(this.getClass().getName()+"On");
    }

    @Override
    public void off() {
        System.out.println(this.getClass().getName()+"Off");
    }

}
