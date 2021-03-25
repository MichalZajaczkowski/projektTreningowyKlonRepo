package com.company.interfaces;

import java.util.Random;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void printMessage() {
        System.out.println("messega");
    }

    @Override
    public int generateNumber(int range) {
        return new Random().nextInt(range);
    }
}
