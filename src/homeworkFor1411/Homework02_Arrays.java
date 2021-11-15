package homeworkFor1411;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число -
 * это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 *
 *  Далее определить среднее арифметическое всех элементов целочисленного массива и
 *  вывести на консоль только те элементы, которые больше этого среднего арифметического.
 *
 * */

public class Homework02_Arrays {
    public static void main(String[] args) {
        char[] charArray = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] intArray = getIntArray(charArray);
        int average = getAverage(intArray);

        filterBiggerThenAverage(intArray, average);
    }

    private static void filterBiggerThenAverage(int[] intArray, int average) {
        for (int value: intArray) {
            if(value > average){
                System.out.print(value + " ");
            }
        }
    }

    private static int getAverage(int[] intArray) {
    int sum = 0;
        for (int value: intArray) {
            sum += value;
        }
        return sum/ intArray.length;
    }

    private static int[] getIntArray(char[] charArray) {
        int[] intArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            int value = (int) charArray[i];
            intArray[i] = value;
        }
        return intArray;
    }
}
