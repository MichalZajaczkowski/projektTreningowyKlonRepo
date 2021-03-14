package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        try{
            double ourNumber = scanner.nextDouble();
            System.out.println(ourNumber);
        } catch (InputMismatchException e){
            System.out.println("musisz podac liczbę");
        }
    }
}