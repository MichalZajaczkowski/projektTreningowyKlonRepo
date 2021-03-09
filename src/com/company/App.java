package com.company;

public class App {

    public static void main(String[] args) {
        Engine engine1 = new Engine(150,1500);
        /*engine1.power = 150;
        engine1.capacity = 1500;*/
        Engine engine2= new Engine(250,2500);
        /*engine2.power = 250;
        engine2.capacity = 2500;*/

        Car Car1 = new Car("Car1Name");
        Car1.engine = engine1;
        Car Car2 = new Car("Car2Name    ");
        Car2.engine = engine2;

        Car1.printName();
        Car1.engine.printPower();
        Car1.engine.printCapacity();

        Car2.printName();
        Car2.engine.printPower();
        Car2.engine.printCapacity();

        //myCar2.engine => engine2
        //engine2.power => myCar2.engine.power




    }
}