package org.shubhamLearning.AbstractFactoryPattern;

import org.shubhamLearning.AbstractFactoryPattern.VehicleFactory.CarFactory.CarFactory;
import org.shubhamLearning.AbstractFactoryPattern.VehicleFactory.CarFactory.Impl.NormalCarFactory;
import org.shubhamLearning.AbstractFactoryPattern.VehicleFactory.CarFactory.Impl.SportsCarFactory;
import org.shubhamLearning.AbstractFactoryPattern.VehicleFactory.CarFactory.Impl.SuperCarFactory;

public class CarFactoryProducer {
    public static CarFactory getFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("SuperCar")) {
            return new SuperCarFactory();
        } else if (factoryType.equalsIgnoreCase("SportsCar")) {
            return new SportsCarFactory();
        } else if (factoryType.equalsIgnoreCase("NormalCar")) {
            return new NormalCarFactory();
        }
        return null;
    }
}
