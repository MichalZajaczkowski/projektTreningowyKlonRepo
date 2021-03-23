package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Path path = Paths.get("src","com", "company", "file.txt");

        try {
            //Files.createFile(path);
            List<String> strings = Files.readAllLines(path);
            for (String s: strings) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}