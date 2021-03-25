package com.company.abstraction;

public class AbstractClassImpl extends AbstractClass{
    @Override
    public void printType() {
        number = 6;
        System.out.println(this.getClass().getSimpleName());
    }
}
