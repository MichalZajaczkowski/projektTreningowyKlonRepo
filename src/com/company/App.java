package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        printNames("a", "b");
        printNames("A", "B", "C", "D");
    }
    private static void printNames(String...strings){
 /*       for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }*/

        for (String s: strings) {
            System.out.println(s);
        }
    }
}