package com.company;

import com.company.vehicle.Car;
import com.company.vehicle.Engine;

public class App {

    public static void main(String[] args) {
        //Car.staticMethod();metody statyczne mogę uruchamiać
        // bezpośrednio na klasie nie potrzebuję od tego obiektu

        Engine engine1 = new Engine();
        engine1.setPower(150);
        engine1.setCapacity(1500);
        Engine engine2= new Engine();
        engine2.setPower(250);
        engine2.setCapacity(2500);

        Car Car1 = new Car("Car1Name");
        Car1.setEngine(engine1);
        Car Car2 = new Car("Car2Name");
        Car2.setEngine(engine2);

        Car1.printName();
        Car1.getEngine().printPower();
        Car1.getEngine().printCapacity();

        Car2.printName();
        Car2.getEngine().printPower();
        Car2.getEngine().printCapacity();

        //Car2.engine => engine2
        //engine2.power => Car2.engine.power

        Calculator calculator = new Calculator(15,7);
        Calculator calculator2 = new Calculator(1574,77);
        Calculator calculator3 = new Calculator(2135,67);
        Calculator calculator4 = new Calculator(4451,227);

        calculator.printCalculator();
        calculator2.printCalculator();
        calculator3.printCalculator();
        calculator4.printCalculator();



    }
}