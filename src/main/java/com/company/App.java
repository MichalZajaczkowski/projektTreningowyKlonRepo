package com.company;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(12, "pierwszy");
        integerStringMap.put(2, "drugi");
        integerStringMap.put(22, "trzeci");
        integerStringMap.put(14, "czwarty");
        integerStringMap.put(7, "piaty");
        integerStringMap.put(74, "czwarty");
        integerStringMap.put(2, "siódmy");
        //System.out.println("mapa integerStringMap: " + integerStringMap.get(1));
        System.out.println(integerStringMap.keySet());
        System.out.println(integerStringMap.values());

        for (Integer i : integerStringMap.keySet()) {
            //System.out.println(i);
            System.out.println(i +": " +integerStringMap.get(i));
        }

        System.out.println("============================");

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("jeden", 1);
        stringIntegerMap.put("klucz", 2);
        stringIntegerMap.put("trzy", 3);

        System.out.println("mapa stringIntegerMap: " + stringIntegerMap.get("klucz"));
    }
}