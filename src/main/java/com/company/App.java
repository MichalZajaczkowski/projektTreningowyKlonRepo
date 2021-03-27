package com.company;

import java.util.*;

public class App {

    private static Map<Integer, List<String>> groupNames(String... names) {
        //adam, jan, piotr, kasia
        //3 -jan
        //4 - adam
        // 5- piotr, kasia
        Map<Integer, List<String>> result = new HashMap<>();
        for (String name : names) {
            int key = name.length(); //key
            // pobrać aktualną listę z danego klucza

            result.putIfAbsent(key, new ArrayList<>());
            List<String> value = result.get(key); // value
            value.add(name);
            result.put(key, value);
        }
        return result;
    }
    public static void main(String[] args) {

        Map<Integer, List<String>> map = groupNames("jan", "adam", "piotr", "kasia");
        System.out.println(map);

    }
}