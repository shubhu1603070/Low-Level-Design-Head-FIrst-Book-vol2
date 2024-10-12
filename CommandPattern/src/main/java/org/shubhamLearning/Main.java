package org.shubhamLearning;

import org.shubhamLearning.Control.RemoteControl;
import org.shubhamLearning.Factory.LightFactory;
import org.shubhamLearning.VendorClasses.Light.Light;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(7);


        LightFactory lightFactory = new LightFactory();
        Light bedRoomLight = lightFactory.getObject("BedRoomLight");
        Light garageLight = lightFactory.getObject("GarageLight");

        assert bedRoomLight!=null;
        assert garageLight != null;
        remoteControl.setCommand(0, bedRoomLight::on, bedRoomLight::off);

        remoteControl.onCommandPushed(0);
        System.out.println("*****************");
        remoteControl.offCommandPushed(0);;
        remoteControl.undoCommandPushed(0);
    }
}