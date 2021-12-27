package com.berg.homework1226.practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

/**
 * 5. Даны два объекта LocalDate из предыдущего задания. Подсчитать количество
 * секунд между полуночью первой даты и полуночью второй даты.
 * */
public class Task6 {
    public static void main(String[] args) {
        var now = LocalDate.now();
        var fromDate = LocalDate.of(2018, 7, 7);
        var period = Period.between(fromDate, now);
//        var of = LocalDateTime.of(now, LocalTime.MIDNIGHT);
        var localDateTime = now.atStartOfDay();
        var localDateTimeFrom = fromDate.atStartOfDay();
        var duration = Duration.between(localDateTimeFrom, localDateTime);
        System.out.println(duration.getSeconds());
    }
}
