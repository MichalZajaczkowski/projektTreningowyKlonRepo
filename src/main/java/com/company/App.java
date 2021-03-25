package com.company;

import com.company.Aminals.Cat;
import com.company.Aminals.Dog;
import com.company.interfaces.AnotherMyInterfaceImpl;
import com.company.interfaces.MyInterfaceImpl;
import com.company.interfaces.MyInterface;

public class App {

    private static void testInterface(MyInterface myInterface) {
        myInterface.printMessage();
    }

    public static void main(String[] args) {

        MyInterface myInterface = new MyInterfaceImpl();
        AnotherMyInterfaceImpl anotherMyInterface = new AnotherMyInterfaceImpl();

        testInterface(myInterface);
        testInterface(anotherMyInterface);

        System.out.println("==================================");

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        dog.printImplDef();
        cat.eat();
    }
}