package com.berg.homework1205.practice;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. Дан список строк. Найти количество уникальных
 * строк длиной более 8 символов.
 * */
public class Task2{

    public static void main(String[] args) {
        List<String> stringList = List.of("string-1",
                "string-2",
                "string-3",
                "string-4",
                "string-10",
                "string-10",
                "string-10",
                "string-12",
                "string-16");
        int size = stringList.stream()
                .filter(string -> string.length() > 8)
                .collect(Collectors.toSet())
                .size();
    }
}
