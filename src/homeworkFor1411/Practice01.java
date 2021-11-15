package homeworkFor1411;

/**
 * Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию,
 * и печатает результат. Цикличность означает, что последний элемент массива
 * становится самым первым его элементом.
 * */

public class Practice01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        moveArray(array);
    }

    private static void moveArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int tmpInt = array[0];
            for (int j = 0; j < array.length-1; j++) {
                array[j] = array[j+1];
            }
            array[array.length-1] = tmpInt;
            for (int arrayElement: array) {
                System.out.print(arrayElement + " ");
            }
            System.out.println();
        }
    }
}
