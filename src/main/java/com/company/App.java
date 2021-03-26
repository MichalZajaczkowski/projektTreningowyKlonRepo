package com.company;

import com.company.vehicle.Car;

public class App {
    public static void main(String[] args) {

        MyGenericType t1 = new MyGenericType("string");
        MyGenericType t2 = new MyGenericType(new Car());
        MyGenericType t3 = new MyGenericType(3);
        MyGenericType t4 = new MyGenericType(3.5);

        t1.printItemType();
        t2.printItemType();
        t3.printItemType();
        t4.printItemType();

        if (t2.getItem() instanceof Car) {
            ((Car) t2.getItem()).setMaxSpeed(120);
        }
    }
}