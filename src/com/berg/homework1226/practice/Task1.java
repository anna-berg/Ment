package com.berg.homework1226.practice;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 1. Создать объект LocalDateTime, представляющий собой
 * дату 25.06.2020 19:47. Используя этот объект, создать другой объект LocalDateTime,
 * представляющий собой дату через 3 месяца после сегодняшней.
 * Вывести на консоль содержащиеся в нем объеты LocalDate and LocalTime.
 * */
public class Task1 {
    public static void main(String[] args) {
        var dateTime = LocalDateTime.of(2020, 06, 25, 19, 47);
        var plus3Days = dateTime.plus(3L, ChronoUnit.DAYS);
        System.out.println(plus3Days.toLocalDate());
        System.out.println(plus3Days.toLocalTime());
    }
}
