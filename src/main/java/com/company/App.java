package com.company;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(2);
        set.add(6);
        set.add(2);
        System.out.println("ilość elementów w secie: " + set.size());

        for (Integer i : set){
            System.out.println(i);
           // System.out.println(i.hashCode());
        }
    }
}