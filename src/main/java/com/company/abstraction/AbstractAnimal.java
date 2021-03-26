package com.company.abstraction;

public abstract class AbstractAnimal {

    public int number = 2;

    public abstract void printNameAnimal();

    public void printNumber() {
        System.out.println(number);
    }
}
