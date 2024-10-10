package org.shubhamLearning.AbstractFactoryPattern.VehicleFactory.CarFactory;

import org.shubhamLearning.AbstractFactoryPattern.Cars.Car;

public abstract class CarFactory {
    public abstract Car getCar(String carName);
}
