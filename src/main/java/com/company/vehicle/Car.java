package com.company.vehicle;

public class Car {
    private String name;
    private Engine engine;
    private Integer maxSpeed;
    private Color color;

/* public Car(){  // konstruktor bezparametrowy
            name = "default";
        }*/

    public Car(){
    }

     public Car(String name, Integer maxSpeed){  // konstruktor
         this.name = name;
         this.maxSpeed = maxSpeed;
    }

    public void  printName(){ // metoda bezparametrowa
        System.out.println(name);
    }
    public void printMaxSpeed(){
        System.out.println(maxSpeed);
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

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
