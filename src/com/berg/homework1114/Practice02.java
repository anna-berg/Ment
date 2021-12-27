package com.berg.homework1114;

import java.util.Arrays;

/**
 * Написать программу, удаляющую все повторяющиеся целые числа из массива и печатающую результат.
 * Массив должен использоваться тот же самый. На место удаленных элементов ставить цифру 0.
 * */

public class Practice02 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 3, 4, 4};
        removeRepeats(array);
        System.out.println(Arrays.toString(array));
    }

    private static void removeRepeats(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] == array[j] && array[j] != 0){
                    array[j] = 0;
                }
            }
        }
    }

}
