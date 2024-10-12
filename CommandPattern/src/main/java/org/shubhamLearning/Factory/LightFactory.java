package org.shubhamLearning.Factory;

import org.shubhamLearning.VendorClasses.Light.BedRoomLight;
import org.shubhamLearning.VendorClasses.Light.DrawingRoomLight;
import org.shubhamLearning.VendorClasses.Light.GarageLight;
import org.shubhamLearning.VendorClasses.Light.Light;

public class LightFactory implements Factory{
    @Override
    public Light getObject(String light) {
        return switch (light){
            case "BedRoomLight" -> new BedRoomLight();
            case "DrawingRoomLight" -> new DrawingRoomLight();
            case "GarageLight" -> new GarageLight();
            default -> null;
        };
    }
}
