package org.shubhamLearning.VendorClasses.Light;

import org.shubhamLearning.VendorClasses.Vendor;

public class GarageLight implements Light{

    @Override
    public void on() {
        System.out.println(this.getClass().getName()+"On");
    }

    @Override
    public void off() {
        System.out.println(this.getClass().getName()+"Off");
    }
}
