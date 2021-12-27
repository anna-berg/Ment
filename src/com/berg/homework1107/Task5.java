package com.berg.homework1107;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
 * Решить двумя способами: с помощью цикла и с помощью рекурсии.
 * */

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fibonache number");
        var fibN = scanner.nextInt();
        System.out.println("Fibonache While:");
        fibWhile(fibN);
        System.out.println("Fibonache rec:");
        for (int i = 0; i < fibN; i++) {
            var f = fibRec(i);
            if (f <fibN) {
                System.out.println(f);
            }
        }
    }
//  0, 1, 1, 2, З, 5, 8, 1З, 21, З4, 55, 89, 144
//  (0+1)+(1+2)+(2+3)
    private static void fibWhile(int nextInt) {
        int n1 = 0;
        int n2 = 1;
        int sum;
        System.out.println(n1);
        while ( (n1 + n2) < nextInt ){
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.println(n2);
        }
    }
    private static int  fibRec(int n){
        if(n == 0) {
            return 0;
        } else if(n == 1){
            return 1;
                } else {
                    return fibRec(n-1) + fibRec(n-2);
                }
    }
}
