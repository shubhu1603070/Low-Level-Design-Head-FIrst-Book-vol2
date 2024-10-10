package org.shubhamLearning.AbstractFactoryPattern.Cars.NormalCars.Impl;

import org.shubhamLearning.AbstractFactoryPattern.Cars.NormalCars.NormalCar;

public class Suzuki extends NormalCar {
    @Override
    public void printCar() {
        System.out.println("It's Suzuki");
    }
}
