package org.shubhamLearning.AbstractFactoryPattern.Cars.NormalCars.Impl;

import org.shubhamLearning.AbstractFactoryPattern.Cars.NormalCars.NormalCar;
import org.shubhamLearning.AbstractFactoryPattern.Cars.SuperCars.SuperCar;

public class Honda extends NormalCar {
    @Override
    public void printCar() {
        System.out.println("It's Honda");
    }
}
