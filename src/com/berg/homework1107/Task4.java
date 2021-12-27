package com.berg.homework1107;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 * */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sum(scanner.nextInt()));
    }

    private static int sum (int n){
        int current = n;
        int sum = 0;
        for (int i = current; i != 0; i/=10) {
            sum += i%10;
        }
        return sum;
    }

}
