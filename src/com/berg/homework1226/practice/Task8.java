package com.berg.homework1226.practice;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 7. Написать свою реализацию интерфейса TemporalAdjuster, которая бы
 * прибавляла к дате 42 дня
 * */
public class Task8 {

    public static void main(String[] args) {
        var now = LocalDateTime.now();
        now.with(temporal -> temporal.plus(42L, ChronoUnit.DAYS));
    }
}
