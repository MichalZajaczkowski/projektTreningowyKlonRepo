package com.company.vehicle;

public class Car {
    private String name;
    private Engine engine;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
