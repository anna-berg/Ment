package com.berg.homework1226.homework.util;

import java.util.Random;

public class RandomUtil {

    private static final Random RANDOM = new Random();

    private RandomUtil() {
    }

    public static int getNextWithoutZero(int bound) {
        return RANDOM.nextInt(bound) + 3;
    }

    public static int getNext(int bound) {
        return RANDOM.nextInt(bound);
    }
}
