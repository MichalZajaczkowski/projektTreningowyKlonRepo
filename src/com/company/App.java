package com.company;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.trim();
        System.out.println(wordCounter(s));
    }

    private static int wordCounter(String s) {
        String[] strings = s.split(" ");
        int counter = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].isEmpty()){
               continue;
            }
            counter++;
            System.out.println("" + strings[i] + "");
        }
        return counter;
    }
}