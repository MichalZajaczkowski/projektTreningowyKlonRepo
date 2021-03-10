package com.company;

public class Car {
    public String name;
    public Engine engine;
    public int maxSpeed;

   /* public Car(){  // konstruktor bezparametrowy
        name = "default";
    }*/

     public Car(String name){  // konstruktor
         this.name = name;
    }

    public void printName(){ // metoda bezparametrowa
        System.out.println(name);
    }

   /* public static void staticMethod(){
           metody statyczne mogę uruchamiać bezpośrednio na klasie
           nie potrzebuję od tego obiektu
    }*/
}
