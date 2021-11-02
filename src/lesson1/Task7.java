package lesson1;

import java.util.Scanner;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 * */
public class Task7 {
    public static void main(String[] args) {
        int number = 228910;
        System.out.println(even(number));
        System.out.println(notEven(number));
    }

    private static int notEven(int number) {
        int notEven = 0;
        while (number > 0){
            int n = number%10;
            if ( n%2 == 1){
                notEven++;
            }
            number /= 10;
        }
        return notEven;
    }

    private static int even(int number) {
        int even = 0;
        while (number > 0){
            int n = number%10;
            if ( n%2 == 0){
                even++;
            }
            number /= 10;
        }
        return even;
    }
}
