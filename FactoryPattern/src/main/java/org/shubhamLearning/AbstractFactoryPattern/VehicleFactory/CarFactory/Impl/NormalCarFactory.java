package org.shubhamLearning.AbstractFactoryPattern.VehicleFactory.CarFactory.Impl;

import org.shubhamLearning.AbstractFactoryPattern.Cars.Car;
import org.shubhamLearning.AbstractFactoryPattern.Cars.NormalCars.Impl.Honda;
import org.shubhamLearning.AbstractFactoryPattern.Cars.NormalCars.Impl.Suzuki;
import org.shubhamLearning.AbstractFactoryPattern.Cars.SportsCars.Impl.Chevrolet;
import org.shubhamLearning.AbstractFactoryPattern.Cars.SportsCars.Impl.Porsche;
import org.shubhamLearning.AbstractFactoryPattern.VehicleFactory.CarFactory.CarFactory;

import java.util.Objects;

public class NormalCarFactory extends CarFactory{
    @Override
    public Car getCar(String carName) {
        if (Objects.nonNull(carName)) {
            if (carName.equals("Honda"))
                return new Honda();
            if (carName.equals("Suzuki"))
                return new Suzuki();
        }
        System.out.println(carName+" We don't have factory for this car");
        return null;
    }
}
