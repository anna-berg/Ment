package lesson1;

/*
* Даны 3 переменные:
    - operand1 (double)
    - operand2 (double)
    - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
    Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
    Протестировать функцию в main.
    Например:
    Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
    Результат: 34.5 (24.4 + 10.1)
*
* */

public class IfElse2 {
    public static void main(String[] args) {
        double operand1 = 5.0;
        double operand2 = 2.0;
        char operation = '%';

        System.out.println("Result operation: " + operand1 + " " + operation + " " + operand2 + " = " + calc(operand1, operand2, operation));
    }

    public static double calc(double o1, double o2, char operation) {
        switch (operation){
            case '+' -> {
                return o1 + o2;
            }
            case '-' -> {
                return o1-o2;
            }
            case '*' -> {
                return o1*o2;
            }
            case '/' -> {
                return o1/o2;
            }
            case '%' -> {
                return o1%o2;
            }
            default -> {
                throw new RuntimeException("Unknown operation");
            }
        }
    }
}
