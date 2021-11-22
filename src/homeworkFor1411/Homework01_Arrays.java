package homeworkFor1411;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив
 * с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для
 * тестирования написанного функционала
 */

public class Homework01_Arrays {
    public static void main(String[] args) {
        int[] array = {3, 5, -6, 3, 2, -9, 0, -123};

        System.out.println(Arrays.toString(deleteNegativeNumber(array)));
    }

    private static int[] deleteNegativeNumber(int[] array) {
        int positiveCounter = 0;
        for (int number : array) {
            if (number >= 0) {
                positiveCounter++;
            }
        }

        int[] positiveArray = new int[positiveCounter];
        int counter = 0;

        for (int number : array) {
            if (number >= 0) {
                positiveArray[counter++] = number * positiveCounter;
            }
        }
        return positiveArray;
    }
}
