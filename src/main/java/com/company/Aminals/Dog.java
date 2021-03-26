package com.company.Aminals;

import com.company.abstraction.AbstractAnimal;

public class Dog extends AbstractAnimal implements Animals{

    @Override
    public void printNameAnimal() {
        System.out.println("sparky ");
    }

    @Override
    public void printType() {
        super.printType();
    }

    @Override
    public void eat() {

    }
}


