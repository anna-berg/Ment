package com.berg.homework1226.practice;

import java.time.LocalDate;
import java.time.Period;

/**
 * 4. Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату. Создать объект LocalDate, представляющий собой дату
 * 07.07.2018. Используя созданные объекты, найти количество дней между
 * этими двумя датами.
 * */
public class Task5 {
    public static void main(String[] args) {
        var now = LocalDate.now();
        var fromDate = LocalDate.of(2018, 7, 7);
        var period = Period.between(fromDate, now);
        System.out.println(period.getDays());
    }
}
