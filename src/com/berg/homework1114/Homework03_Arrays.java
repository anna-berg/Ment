package com.berg.homework1114;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, которая принимает этот массив и разбивает на 3 других:
 * с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * Пример:
 * [-4, -18]
 * [-4, 0, 1, 9, 0, -18, 3] ->  [0, 0]
 * [1, 9, 3]
 */

public class Homework03_Arrays {
    public static void main(String[] args) {
        int[] lineArray = {-4, 0, 1, 9, 0, -18, 3};

        var devidedArrey = devideArray(lineArray);
        System.out.println(Arrays.toString(devidedArrey[0]));
        System.out.println(Arrays.toString(devidedArrey[1]));
        System.out.println(Arrays.toString(devidedArrey[2]));
    }

    private static int[][] devideArray(int[] lineArray) {
        int negativeCounter = 0;
        int positiveCounter = 0;
        int nullCounter = 0;

        int[][] result = new int[3][];
        for (int value : lineArray) {
            if (value == 0) {
                nullCounter++;
            } else {
                if (value > 0) {
                    positiveCounter++;
                } else {
                    negativeCounter++;
                }
            }
        }

        result[0] = new int[negativeCounter];
        result[1] = new int[nullCounter];
        result[2] = new int[positiveCounter];

        negativeCounter = 0;
        nullCounter = 0;
        positiveCounter = 0;

        for (int value : lineArray) {
            if (value == 0) {
                result[1][nullCounter] = value;
                nullCounter++;
            } else {
                if (value > 0) {
                    result[2][positiveCounter] = value;
                    positiveCounter++;
                } else {
                    result[0][negativeCounter] = value;
                    negativeCounter++;
                }
            }
        }
        return result;
    }
}
