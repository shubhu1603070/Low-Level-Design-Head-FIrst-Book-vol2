package org.decorator.Features;

import org.decorator.Base.Vehicle;
import org.decorator.Decorator.VehicleDecorator;

/*
    AC is a feature of a Vehicle
    AC have a Vehicle -> Without Vehicle, AC doesn't make any sense
    Has-A Relationship
*/
public class AC extends VehicleDecorator {

    public Vehicle vehicle;

    public AC(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public int cost() {
        return vehicle.cost() + 2500;
    }


    @Override
    public String display() {
        return vehicle.display() + "\nAdded AC ";
    }
}
