package com.berg.homework1114;

import java.util.Arrays;

/**
 * Написать функцию linearize, которая принимает в качестве параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами двумерного.
 * */

public class Practice04 {

    public static void main(String[] args) {
        int[][] twoDimensionalArray = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };

        System.out.println(Arrays.toString(linearize(twoDimensionalArray)));
    }

    private static int[] linearize(int[][] twoDimensionalArray) {
        var arraySise = calculateArrayLangh(twoDimensionalArray);
        int[] result = new int[arraySise];
        int counter = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            int[] arrayLine = twoDimensionalArray[i];
            for (int j = 0; j < arrayLine.length; j++) {
                result[counter++] = arrayLine[j];
            }
        }
        return result;
    }

    private static int calculateArrayLangh(int[][] array) {
        int arraySize = 0;
        for (int i = 0; i < array.length; i++) {
            arraySize += array[i].length;
        }
        return arraySize;
    }
}
