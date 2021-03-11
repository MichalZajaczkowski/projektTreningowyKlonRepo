package com.company;

public class Calculator {
    private Integer a;
    private Integer b;

    public Calculator (Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public void printCalculator(){ // metoda bezparametrowa
        System.out.println(a.doubleValue() / b);
    }
}
