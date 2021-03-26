package com.company.abstraction;

public abstract class AbstractAnimal {

    public abstract void printNameAnimal();

    public void printType() {
        System.out.println(this.getClass().getSimpleName());
    }
}
