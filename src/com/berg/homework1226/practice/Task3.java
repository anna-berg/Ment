package com.berg.homework1226.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 3. Дана строка вида "26-03-1968T09:24". Получить объект LocalDateTime, представляющий
 * собой дату, полученную из этой строки.
 * */
public class Task3 {
    public static void main(String[] args) {
        String stringDate = "26-03-1968T09:24";
        var dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        var localDateTime = LocalDateTime.parse(stringDate, dateTimeFormatter);
        System.out.println(localDateTime);
    }
}
