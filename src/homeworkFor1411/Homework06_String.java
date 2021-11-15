package homeworkFor1411;

import java.util.Arrays;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 *
 *  Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 *
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 * */

public class Homework06_String {
    public static void main(String[] args) {
        String line = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] digitArray = filterDigit(line);
        System.out.println(Arrays.toString(digitArray));
        int sum = calculateSum(digitArray);
        System.out.println(sum);
    }

    private static int calculateSum(int[] digitArray) {
        int sum = 0;
        for (int i : digitArray) {
            while (i>0){
                sum += i%10;
                i /= 10;
            }
        }
        return  sum;
    }

    private static int[] filterDigit(String line) {
        char[] charArray = line.toCharArray();
        int counter = 0;
        for (char ch: charArray) {
            if (Character.isDigit(ch)){
                counter++;
            }
        }
        int[] intArray = new int[counter];
        counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])){
                intArray[counter] = Character.getNumericValue(charArray[i]);
                counter++;
            }
        }
        return intArray;
    }

}
