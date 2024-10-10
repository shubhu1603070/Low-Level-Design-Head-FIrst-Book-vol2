package org.shubhamLearning.AbstractFactoryPattern.Cars.SuperCars.Impl;

import org.shubhamLearning.AbstractFactoryPattern.Cars.Car;
import org.shubhamLearning.AbstractFactoryPattern.Cars.SuperCars.SuperCar;

public class Bugatti extends SuperCar{
    @Override
    public void printCar() {
        System.out.println("It's Bugatti");

    }
}
