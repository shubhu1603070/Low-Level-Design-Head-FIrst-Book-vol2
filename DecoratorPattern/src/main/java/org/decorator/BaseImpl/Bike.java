package org.decorator.BaseImpl;

import org.decorator.Base.Vehicle;

public class Bike extends Vehicle {
    @Override
    public int cost() {
        return 15000;
    }

    @Override
    public String display() {
        return "Buying Bike : ";
    }
}
