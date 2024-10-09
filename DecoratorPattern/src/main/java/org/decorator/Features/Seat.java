package org.decorator.Features;

import org.decorator.Base.Vehicle;
import org.decorator.Decorator.VehicleDecorator;

/*
    Seat is a feature of a Vehicle
    Seat have a Vehicle -> Without Vehicle, Seat doesn't make any sense
    Has-A Relationship
*/
public class Seat extends VehicleDecorator {

    public Vehicle vehicle;

    public Seat(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public int cost() {
        return vehicle.cost() + 1500;
    }


    @Override
    public String display() {
        return vehicle.display() + "\nAdded Seat ";
    }
}
