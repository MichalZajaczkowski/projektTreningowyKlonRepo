package com.company;

import com.company.vehicle.Car;
import com.company.vehicle.Engine;

public class App {

    public static void main(String[] args) {
        Car car1 = new Car("car1", 100);
        Car car2 = new Car("car2", 200);
        Car car3 = new Car();
        car3.setName("car3");
        car3.setMaxSpeed(350);
        Car car4 = new Car();
        car4.setName("car4");
        car4.setMaxSpeed(250);


        String nameOfFasterCar = getNameOfFasterCar(car1, car2);
        printNameOfFasterCar(car3, car4);
        System.out.println(nameOfFasterCar);
        System.out.println("car1 name: " + car1.getName() + " car2 name: " + car2.getName());
        System.out.println("car3 name: " + car3.getName() + " car4 name: " + car4.getName());
    }

    private static String getNameOfFasterCar(Car car1, Car car2) {
        String result;
        if (car1.getMaxSpeed() > car2.getMaxSpeed()) {
            result = car1.getName();
            car1.setName("fasterCar");
        } else if (car1.getMaxSpeed() < car2.getMaxSpeed()){
            result =  car2.getName();
            car2.setName("fasterCar");
        } else {
            result =  "prędkoci są takie same";
        }
        return result;
    }

    private static void printNameOfFasterCar(Car car3, Car car4) {
        if (car3.getMaxSpeed() > car4.getMaxSpeed()) {
            car3.printName();
            car3.setName("fasterCar");
        } else if (car3.getMaxSpeed() < car4.getMaxSpeed()){
            car4.printName();
            car4.setName("fasterCar");
        } else {
            System.out.println("prędkoci są takie same");
        }
    }
}