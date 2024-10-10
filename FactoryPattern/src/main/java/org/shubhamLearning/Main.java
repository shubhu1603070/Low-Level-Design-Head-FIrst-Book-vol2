package org.shubhamLearning;

import org.shubhamLearning.AbstractFactoryPattern.CarFactoryProducer;
import org.shubhamLearning.AbstractFactoryPattern.Cars.Car;
import org.shubhamLearning.AbstractFactoryPattern.VehicleFactory.CarFactory.CarFactory;
import org.shubhamLearning.AbstractFactoryPattern.VehicleFactory.CarFactory.Impl.SportsCarFactory;
import org.shubhamLearning.AbstractFactoryPattern.VehicleFactory.CarFactory.Impl.SuperCarFactory;
import org.shubhamLearning.FactoryPattern.Enums.PaymentType;
import org.shubhamLearning.FactoryPattern.PaymentFactory.Impl.PaymentFactoryImpl;
import org.shubhamLearning.FactoryPattern.PaymentFactory.PaymentFactory;
import org.shubhamLearning.SimpleFactory.SimpleFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n*********** SIMPLE FACTORY PATTERN ***********************\n");
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.doCashPayment();
        System.out.println("\n*************** ANOTHER PAYMENT **************************\n");
        simpleFactory.doCardPayment();
        System.out.println("\n*************** ANOTHER PAYMENT **************************\n");
        simpleFactory.doOnlinePayment();

        System.out.println("\n*********** STANDARD FACTORY PATTERN *********************\n");

        PaymentFactory cardPaymentFactory = new PaymentFactoryImpl();
        cardPaymentFactory.doPayment(PaymentType.CREDIT);
        System.out.println("\n*************** ANOTHER PAYMENT **************************\n");
        cardPaymentFactory.doPayment(PaymentType.DEBIT);
        System.out.println("\n*************** ANOTHER PAYMENT **************************\n");
        cardPaymentFactory.doPayment(PaymentType.CASH);
        System.out.println("\n*************** ANOTHER PAYMENT **************************\n");
        cardPaymentFactory = new PaymentFactoryImpl();
        cardPaymentFactory.doPayment(PaymentType.CASH);
        System.out.println("\n*************** ANOTHER PAYMENT **************************\n");
        cardPaymentFactory.doPayment(PaymentType.DEBIT);


        System.out.println("\n*********** ABSTRACT FACTORY PATTERN *********************\n");


        CarFactory superCars = CarFactoryProducer.getFactory("SuperCar");
        CarFactory sportsCar = CarFactoryProducer.getFactory("SportsCar");

        if (superCars != null){
            Car bugatti = superCars.getCar("Bugatti");
            bugatti.printCar();
        }

        if(sportsCar!=null) {
            Car porsche = sportsCar.getCar("Porsche");
            Car chevrolet = sportsCar.getCar("Chevrolet");
            porsche.printCar();
            chevrolet.printCar();
        }

    }
}