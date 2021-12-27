package com.berg.homework1212.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ReaderRunner {

    public static void main(String[] args) {
        File file = Path.of("resources/text.txt").toFile();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String result = reader.lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
