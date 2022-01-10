package com.berg.homework0103.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegesTest {

    public static void main(String[] args) {
//        String input = "2";
//        String input = "2021-12-22T11:38:16";
//        String input = "Петров Петр";
//        String input = "+375257777765";
        String input = "+Почему опять не работает интернет?";
//        Pattern pattern = Pattern.compile("^(?<id>\\d+), (?<time>\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}), (?<name>[А-Яа-я]+), (?<phone>\\+?\\d{0,3}\\s?\\d{2}\\s?\\d{3}\\s?\\d{2}\\s?\\d{2}), (?<text>[А-Яа-я]+)$");
//        Pattern pattern = Pattern.compile("(?<id>\\d+)"); // true
//        Pattern pattern = Pattern.compile("(?<time>\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2})"); // true
//        Pattern pattern = Pattern.compile("(?<name>[А-Яа-яёЁ]+\\s[А-Яа-яёЁ]+)"); // true
//        Pattern pattern = Pattern.compile("(?<phone>\\+?\\d{0,3}\\s?\\d{2}\\s?\\d{3}\\s?\\d{2}\\s?\\d{2})");
        Pattern pattern = Pattern.compile("(?<text>.+)");
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches());
    }
}
