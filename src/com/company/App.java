package com.company;

import com.company.vehicle.Car;

public class App {
    public static void main(String[] args) {

 /*       Color color = Color.RED;
        System.out.println(color);
        System.out.println(color.ordinal());

        Color[] values = Color.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        Color color1 = Color.valueOf("A");
        System.out.println(color1);
        System.out.println(color1.ordinal());*/

        Car car = new Car();
        car.setColor(Color.RED);
        System.out.println(car.getColor());
        System.out.println(car.getColor().getCarColorPl());
    }
}