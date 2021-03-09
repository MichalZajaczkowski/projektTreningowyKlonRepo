package com.company;

public class Engine {
    public Integer power;
    public Integer capacity;

    public Engine(Integer power, Integer capacity) {
        this.power = power;
        this.capacity = capacity;
    }

    public void printPower(){
        System.out.println(power);
    }
    public void printCapacity(){
        System.out.println(capacity);
    }
}
