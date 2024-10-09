package org.decorator.BaseImpl;

import org.decorator.Base.Vehicle;

/*
    Type of Vehicle -> BIKE
    Is-A relationship
 */
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
