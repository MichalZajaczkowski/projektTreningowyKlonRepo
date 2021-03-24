package com.company.vehicle;

import java.util.Random;

public class Vehicle {
    private final Random random = new Random();
    private Integer id;

    public Vehicle() {
        id = random.nextInt(100);
    }

    public void printId() {
        System.out.println(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
