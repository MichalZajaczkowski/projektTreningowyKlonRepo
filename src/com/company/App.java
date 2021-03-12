package com.company;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);

        System.out.println(countDots(s));
    }

    private static int countDots(String s) {
        char[] chars = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.'){
                counter++;
            }
        }
        return counter;
    }
}