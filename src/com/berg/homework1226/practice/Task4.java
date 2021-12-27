package com.berg.homework1226.practice;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * 4. Использовать LocalDateTime из предыдущего задания, преобразовать его
 * в объект типа Instant, указав тайм зону "America/Chicago". Вывести количество
 * прошедших миллисекунд.
 * */
public class Task4 {
    public static void main(String[] args) {
        String stringDate = "26-03-1968T09:24";
        var dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        var localDateTime = LocalDateTime.parse(stringDate, dateTimeFormatter);
        var instant = localDateTime.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(localDateTime));
        System.out.println(localDateTime);
    }
}
