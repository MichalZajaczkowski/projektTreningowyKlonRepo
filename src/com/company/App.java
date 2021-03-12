package com.company;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = scanner.nextLine();
        System.out.println(s);
        System.out.println(s1);

        System.out.println(countDots(s));
        System.out.println(countDotsWithReplace(s1));
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

    private static int countDotsWithReplace (String s1){
        int baseLength = s1.length();
        String replace = s1.replace(".", "");
        int replaceLength = replace.length();
        return baseLength - replaceLength;
    }
}