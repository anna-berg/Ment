package com.berg.homework1107;

/**
*
* Даны два прямоугольных треугольника. Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.

Для этого понадобится написать 2 функции.
Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.

Учитывать, что площадь может быть вещественным числом.
*
* */
public class IfElse3 {
    public static void main(String[] args) {
        var s1 = triangleArea(5, 4);
        var s2 = triangleArea(8, 9);

        var compare = compare(s1, s2);
        if (compare > 0){
            System.out.println("Area of first triangle bigger then the second");
        } else {
            if (compare < 0){
                System.out.println("Area of second triangle bigger then the first");
            } else {
                System.out.println("Area of first triangle equals the area of second");
            }
        }
    }

    private static double triangleArea (int a, int b){
        return (double)a*b/2;
    }

    private static double compare (double s1, double s2){
        return s1-s2;
    }


}
