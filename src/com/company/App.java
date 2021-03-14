package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            printNumber();
        } catch (InputMismatchException e) {
            System.out.println("wyjatek");
        }
        System.out.println("koniec");
    }
    private static void printNumber() throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);
    }
}