package lesson1;

import java.util.Scanner;

/**
 * Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
 * Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
 * Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 * Не использовать массивы!
 * */
public class Task6 {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of day:");
        int day = scanner.nextInt();
        System.out.println("Enter " + day + "numbers, than mean rainfall per day");
        for (int i = 0; i < day; i++) {
            int rainfall = scanner.nextInt();
            sum+=rainfall;
            if (max < rainfall){
                max = rainfall;
            }
        }
        average = (double) sum/day;
        System.out.println("Number of days: " + day);
        System.out.println("Amount of rainfall: " + sum);
        System.out.println("Average rainfall: " + average);
        System.out.println("Maximum rainfall: " + max);
    }
}
