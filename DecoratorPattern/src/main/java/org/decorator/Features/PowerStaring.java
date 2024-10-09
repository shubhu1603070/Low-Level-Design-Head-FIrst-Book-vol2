package org.decorator.Features;

import org.decorator.Base.Vehicle;
import org.decorator.Decorator.VehicleDecorator;

public class PowerStaring extends VehicleDecorator {

    public Vehicle vehicle;

    public PowerStaring(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public int cost() {
        return vehicle.cost() + 14000;
    }

    @Override
    public String display() {
        return vehicle.display() + "\nAdded Power Staring ";
    }
}
