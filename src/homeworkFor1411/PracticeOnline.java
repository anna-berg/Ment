package homeworkFor1411;

/**
 *  Создать целочисленный массив.
 *  Написать функцию, которая суммирует все значения этого массива
 *
 *  */

public class PracticeOnline {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int sum = getSum(array);

        System.out.println(sum);
    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int value: array) {
            sum += value;
        }
        return sum;
    }
}
