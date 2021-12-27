package com.berg.homework1114;

import java.util.Arrays;

/**
 * Заданы 2 массива целых чисел произвольной длины.
 * Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных.
 * Пример:
 * 1-й массив: {1, 2, 3, 4, 5}
 * 2-й массив: {5, 6, 7}
 * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 * */

public class Practice03 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 6, 7};
        System.out.println(Arrays.toString(joinArrays(array1, array2)));
    }

    private static int[] joinArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length+ array2.length];
        int counter = 0;

        for (int i = 0; i < result.length; i++) {
            if(i < array1.length){
                result[counter] = array1[i];
                counter++;
            }
            if(i < array2.length){
                result[counter] = array2[i];
                counter++;
            }
        }
        return result;
    }

}
