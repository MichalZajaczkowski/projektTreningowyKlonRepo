package com.company;

import com.company.vehicle.Car;
import com.company.vehicle.Engine;

public class App {

    public static void main(String[] args) {

        number11(15);
    }
    public static void number11(int a){
        for (int j = 0; j < a; j++)  {
            if (j % 2 == 0){
                continue;
            }
            if (j % 11 == 0) {
                break;
            }
            System.out.println(j);
        }
    }
}