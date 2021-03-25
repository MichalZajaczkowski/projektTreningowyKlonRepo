package com.company.Aminals;

public interface Animals {
    void eat();

    default void printImplDef() {
        System.out.println("metoda defaultowa w interfejsie");
    }
}
