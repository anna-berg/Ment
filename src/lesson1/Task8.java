package lesson1;
/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 *
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 * */
public class Task8 {
    public static void main(String[] args) {
        int number = 1234567;
        int newNumber = 0;

        while (number>0){
            int n = number%10;
            newNumber = (newNumber*10) + n;
            number /= 10;
        }
        System.out.println(newNumber);

    }
}
