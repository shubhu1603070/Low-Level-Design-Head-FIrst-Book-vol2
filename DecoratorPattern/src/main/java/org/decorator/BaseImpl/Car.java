package org.decorator.BaseImpl;

import org.decorator.Base.Vehicle;

public class Car extends Vehicle {
    @Override
    public int cost() {
        return 10000;
    }

    @Override
    public String display() {
        return "Buying Car : ";
    }
}
