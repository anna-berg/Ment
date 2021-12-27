package com.berg.homework1226.practice;

import java.time.Instant;
import java.time.ZoneId;

/**
 * 6. Создать объект Instant. Вывести его на консоль. Затем создать
 * объект ZonedDateTime на основании предыдущего объекта с тайм зоной "Africa/Cairo".
 * */
public class Task7 {

    public static void main(String[] args) {
        var now = Instant.now();
        System.out.println(now);
        var zonedDateTime = now.atZone(ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTime);
    }
}
