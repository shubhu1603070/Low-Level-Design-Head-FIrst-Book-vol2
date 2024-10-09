package org.decorator.Features;

import org.decorator.Base.Vehicle;
import org.decorator.Decorator.VehicleDecorator;

public class Mirrors extends VehicleDecorator {

    public Vehicle vehicle;

    public Mirrors(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public int cost() {
        return vehicle.cost() + 1000;
    }


    @Override
    public String display() {
        return vehicle.display() + "\nAdded Mirror ";
    }
}
