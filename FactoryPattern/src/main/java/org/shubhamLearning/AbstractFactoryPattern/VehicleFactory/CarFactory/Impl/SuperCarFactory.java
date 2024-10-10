package org.shubhamLearning.AbstractFactoryPattern.VehicleFactory.CarFactory.Impl;

import org.shubhamLearning.AbstractFactoryPattern.Cars.Car;
import org.shubhamLearning.AbstractFactoryPattern.Cars.SuperCars.Impl.Bugatti;
import org.shubhamLearning.AbstractFactoryPattern.Cars.SuperCars.Impl.McLaren;
import org.shubhamLearning.AbstractFactoryPattern.Cars.SuperCars.SuperCar;
import org.shubhamLearning.AbstractFactoryPattern.VehicleFactory.CarFactory.CarFactory;

import java.util.Objects;

public class SuperCarFactory extends CarFactory{
    @Override
    public Car getCar(String carName) {
        if (Objects.nonNull(carName)) {
            if (carName.equals("Bugatti"))
                return new Bugatti();
            if (carName.equals("McLaren"))
                return new McLaren();
        }
        System.out.println(carName+" We don't have factory for this car");
        return null;
    }
}
