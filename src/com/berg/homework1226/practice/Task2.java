package com.berg.homework1226.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 2. Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату. Преобразовать дату в строку вида "05.05.2017". Вывести эту строку на
 * консоль.
 * */
public class Task2 {
    public static void main(String[] args) {
        var now = LocalDate.now();
        var dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.YYY");
        System.out.println(dateTimeFormatter.format(now));
    }
}
