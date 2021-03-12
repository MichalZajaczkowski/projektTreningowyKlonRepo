package com.company;

public class App {
    public static void main(String[] args) {

        int[] tab = number(4);
        printTable(tab);
    }

    private static void printTable(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
    public static int[] number(int a) {
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = a++;
        }
        return tab;
    }
}