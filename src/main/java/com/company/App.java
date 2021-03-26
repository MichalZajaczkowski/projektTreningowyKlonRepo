package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(2);
        set.add(6);
        set.add(2);
        set.add(8);
        set.add(7);
        System.out.println("ilość elementów w secie: " + set.size());

        for (Integer i : set){
            System.out.println(i);
           // System.out.println(i.hashCode());
        }
        System.out.println("======================");
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(11);
        list.add(13);
        list.add(11);
        list.add(17);
        list.add(13);

        System.out.println("elementy w array list: " + list.size());

        for (Integer q : list) {
            System.out.println(q);
        }
    }
}