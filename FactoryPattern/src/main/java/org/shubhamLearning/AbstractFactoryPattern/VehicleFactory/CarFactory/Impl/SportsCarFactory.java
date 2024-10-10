package org.shubhamLearning.AbstractFactoryPattern.VehicleFactory.CarFactory.Impl;

import org.shubhamLearning.AbstractFactoryPattern.Cars.Car;
import org.shubhamLearning.AbstractFactoryPattern.Cars.SportsCars.Impl.Chevrolet;
import org.shubhamLearning.AbstractFactoryPattern.Cars.SportsCars.Impl.Porsche;
import org.shubhamLearning.AbstractFactoryPattern.Cars.SuperCars.Impl.Bugatti;
import org.shubhamLearning.AbstractFactoryPattern.Cars.SuperCars.Impl.McLaren;
import org.shubhamLearning.AbstractFactoryPattern.VehicleFactory.CarFactory.CarFactory;

import java.util.Objects;

public class SportsCarFactory extends CarFactory{
    @Override
    public Car getCar(String carName) {
        if (Objects.nonNull(carName)) {
            if (carName.equals("Chevrolet"))
                return new Chevrolet();
            if (carName.equals("Porsche"))
                return new Porsche();
        }
        System.out.println(carName+" We don't have factory for this car");
        return null;
    }
}
