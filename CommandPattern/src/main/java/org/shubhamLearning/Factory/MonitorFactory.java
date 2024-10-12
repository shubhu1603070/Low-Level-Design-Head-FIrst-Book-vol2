package org.shubhamLearning.Factory;

import org.shubhamLearning.VendorClasses.Monitor.BedRoomMonitor;
import org.shubhamLearning.VendorClasses.Monitor.DrawingRoomMonitor;

public class MonitorFactory implements Factory{

    @Override
    public Object getObject(String str) {
        return switch (str){
            case "BedRoomMonitor" -> new BedRoomMonitor();
            case "DrawingRoomMonitor" -> new DrawingRoomMonitor();
            default -> null;
        };
    }
}
