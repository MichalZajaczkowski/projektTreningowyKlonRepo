package com.company.vehicle;

import java.util.Objects;

public class Engine {
    private Integer power;
    private Integer capacity;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(power, engine.power) && Objects.equals(capacity, engine.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, capacity);
    }
}
