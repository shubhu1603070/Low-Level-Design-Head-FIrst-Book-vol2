package org.decorator.Features;

import org.decorator.Base.Vehicle;
import org.decorator.Decorator.VehicleDecorator;

public class Tyres extends VehicleDecorator {

    public Vehicle vehicle;

    public Tyres(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public int cost() {
        return vehicle.cost() + 4000;
    }


    @Override
    public String display() {
        return vehicle.display() + "\nAdded Tyres ";
    }
}
