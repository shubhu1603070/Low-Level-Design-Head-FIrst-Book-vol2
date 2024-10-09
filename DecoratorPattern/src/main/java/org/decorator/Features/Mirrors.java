package org.decorator.Features;

import org.decorator.Base.Vehicle;
import org.decorator.Decorator.VehicleDecorator;

/*
    Mirror is a feature of a Vehicle
    Mirror have a Vehicle -> Without Vehicle, Mirror doesn't make any sense
    Has-A Relationship
*/
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
