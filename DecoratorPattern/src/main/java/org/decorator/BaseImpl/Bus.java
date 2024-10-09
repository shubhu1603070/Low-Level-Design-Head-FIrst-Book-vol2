package org.decorator.BaseImpl;

import org.decorator.Base.Vehicle;

public class Bus extends Vehicle {
    @Override
    public int cost() {
        return 20000;
    }

    @Override
    public String display() {
        return "Buying Bus : ";
    }
}
