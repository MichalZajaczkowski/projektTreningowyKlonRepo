package com.company.vehicle;

import java.util.Random;

public class Vehicle {
    private final Random random = new Random();
    private Long id;

    public Vehicle() {
        id = random.nextLong();
    }

    public void printId() {
        System.out.println(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
