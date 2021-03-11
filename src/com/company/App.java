package com.company;

import com.company.vehicle.Car;
import com.company.vehicle.Engine;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Car car = biuldCarFromUserInput();
        printCar(car);

    }
    private static void printCar(Car car) {
        System.out.println("nazwa samochodu to: " + car.getName());
        System.out.println("mocs silnika to: " + car.getEngine().getPower());
    }

    private static Car biuldCarFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nazwa samochodu: ");
        String name = scanner.nextLine();
        System.out.println("mocs silnika: ");
        Integer power = scanner.nextInt();

        Engine engine = new Engine();
        engine.setPower(power);
        Car car = new Car();
        car.setName(name);
        car.setEngine(new Engine());
        car.setEngine(engine);

        return car;
    }
}