package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

         boolean flag = true;
         while (flag){
             try{
                 Scanner scanner = new Scanner(System.in);
                 System.out.print("podaj liczbę całkowitą: ");
                 int ourNumber = scanner.nextInt();
                 System.out.println("podano: " + ourNumber);
                 flag = false;
                 //break;
             } catch (InputMismatchException e){
                 System.out.println("musisz podac poprawną wartość");
             }
         }
    }
}