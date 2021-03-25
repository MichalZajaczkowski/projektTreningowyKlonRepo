package com.company;

import com.company.abstraction.AbstractClass;
import com.company.abstraction.AbstractClassImpl;

public class App {
    public static void main(String[] args) {

        AbstractClass abstractClass = new AbstractClassImpl();

        abstractClass.printNumber();
        abstractClass.printType();
        abstractClass.printNumber();

    }
}