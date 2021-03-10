package com.company.vehicle;

public class Engine {
    private Integer power;
    private Integer capacity;

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

 /*   public Engine(Integer power, Integer capacity) {
        this.power = power;
        this.capacity = capacity;
    }*/

    public void printPower(){
        System.out.println(power);
    }
    public void printCapacity(){
        System.out.println(capacity);
    }
}
