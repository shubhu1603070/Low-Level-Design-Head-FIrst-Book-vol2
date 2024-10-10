package org.shubhamLearning.AbstractFactoryPattern.Cars.SportsCars.Impl;

import org.shubhamLearning.AbstractFactoryPattern.Cars.SportsCars.SportsCar;

public class Porsche extends SportsCar{
    @Override
    public void printCar() {
        System.out.println("It's Porsche");
    }
}
