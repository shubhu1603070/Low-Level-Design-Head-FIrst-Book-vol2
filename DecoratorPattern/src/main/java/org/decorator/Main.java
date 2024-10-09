package org.decorator;

import org.decorator.Base.Vehicle;
import org.decorator.BaseImpl.Car;
import org.decorator.Features.AC;
import org.decorator.Features.Mirrors;
import org.decorator.Features.Seat;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car = new AC(car);
        car = new Seat(car);
        System.out.println(car.display()+" \nWith this features Total Cost : "+car.cost());

        /*
            What will happen here is we're wrapping feature over feature

                                    HOW?

            when we create Car class object it's cost and display method is called
            when we create object of AC class we're saying okay wrap me over the CAR I have right now
            when we create object for seat we're saying wrap this feature over AC

            Now when we say car.display() -> car object is holding SEAT Class reference but what it'll do it'll call
             the whole chain present above it
                    Call Seat.display()
                    Call AC.display()
                    AC.display() will call CAR.display()


                    Same with Cost
                    Call Seat.cost()
                    Call AC.cost()
                    Call Car.cost()

                    As we can see the chain that's why we say we wrap object over object and that's what Decorator is
         */

    }
}