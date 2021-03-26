package com.company;

public class MyGenericType <T>{
    private T item;

    public MyGenericType(T item) {
        this.item = item;
    }
    public T getItem(){
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printItemType(){
        System.out.println(item.getClass().getSimpleName());
    }
}
