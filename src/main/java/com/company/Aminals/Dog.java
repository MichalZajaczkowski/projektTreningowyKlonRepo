package com.company.Aminals;

public class Dog implements Animals{
    @Override
    public void eat() {
        System.out.println("dog eat food");
    }

    @Override
    public void printImplDef() {
        System.out.println("metoda defaultowa z interfejsu nadpisana w klasie dog");
    }
}


