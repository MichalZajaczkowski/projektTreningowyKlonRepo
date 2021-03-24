package com.company;

import com.company.vehicle.Car;
import com.company.vehicle.Vehicle;


public class App {

    public static void main(String[] args) {

        Car car = new Car();
        Vehicle vehicle = new Vehicle();
        car.printId();
        vehicle.printId();
    }
}