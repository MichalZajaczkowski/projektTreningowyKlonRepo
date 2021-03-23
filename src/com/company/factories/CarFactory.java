package com.company.factories;

import com.company.Color;
import com.company.vehicle.Car;
import com.company.vehicle.Engine;

import java.util.Random;

public class CarFactory {
    private final Random random = new Random();

    public Car createRandomCar() {
        Car car = new Car();
        car.setName(generateName());
        car.setMaxSpeed(generateNumber(100, 250, 10));
        car.setEngine(generateEngine());
        car.setColor(generateColor());

        return car;
    }

    public Car[] createRandomCars(int amount) {
        Car[] cars = new Car[amount];
        for (int i = 0; i < amount; i++) {
            cars[i] = createRandomCar();
        }
        return cars;
    }

    private String generateName() {
        String[] names = {"Audi", "Opel", "Mercedes", "Fiat", "Ford", "BMW"};
        return names[random.nextInt(names.length)];
    }

    private Integer generateNumber(int min, int max, int step) {
        return random.ints(min/step, max/step)
                .findFirst()
                .getAsInt() * step;
    }

    private Engine generateEngine() {
        Engine engine = new Engine();
        engine.setPower(generateNumber(50, 200, 10));
        engine.setCapacity(generateNumber(1000, 5000, 100));
        return engine;
    }

    private Color generateColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)];
    }
}
