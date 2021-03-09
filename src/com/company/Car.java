package com.company;

public class Car {
    public String name;
    public int maxSpeed;

   /* public Car({  // konstruktor bezparametrowy
        name = "default";
    }*/

     public Car(String name){  // konstruktor
         this.name = name;
    }

    public void printName(){ // metoda bezparametrowa
        System.out.println(name);
    }
}
