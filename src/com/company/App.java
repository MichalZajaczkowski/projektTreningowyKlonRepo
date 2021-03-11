package com.company;

import com.company.vehicle.Car;
import com.company.vehicle.Engine;

public class App {

    public static void main(String[] args) {

        Integer i = 5;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        System.out.println("_");
        Integer q = 5;
        do {
            q--;
            System.out.println(q);
        } while (q > 0);
        System.out.println("_");

        Integer value = 10;
        for (int j = 0; j < value; j++)  {
            System.out.println(j);

        }

    }
}