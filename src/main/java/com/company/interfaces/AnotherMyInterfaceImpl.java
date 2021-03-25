package com.company.interfaces;

public class AnotherMyInterfaceImpl implements MyInterface{
    @Override
    public void printMessage() {
        System.out.println("messega AnotherMyInterfaceImpl");
    }

    @Override
    public int generateNumber(int range) {
        return 4;
    }

    public void printMessageSomething() {
        System.out.println("messega AnotherMyInterfaceImpl");
    }
}
