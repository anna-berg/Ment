package com.berg.homework1226.practice.produserconsumer;

import java.util.Random;

public final class RandomUtil {

    public static final Random RANDOM = new Random();
    public static final int DEFAULT_BOUND = 10;

    private RandomUtil(){

    }

    public static int getRandom(){
        return RANDOM.nextInt(DEFAULT_BOUND);
    }

    public static int getRandom( int bound){
        return RANDOM.nextInt(bound);
    }
}
