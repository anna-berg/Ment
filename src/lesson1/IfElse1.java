package lesson1;

/*
* В переменной minutes лежит число от 0 до 59.
* Написать функцию, которая принимает в качестве параметра значение переменной minutes
* и выводит на консоль в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
* Протестировать функцию в main.
* */


public class IfElse1 {
    public static void main(String[] args) {
        int minutes;
        partOfHour(45);
    }

    public static void partOfHour (int minutes){
        if (minutes >= 0 && minutes <= 15){
            System.out.println( minutes + " minutes are in the first part of the hour");
        } else if (minutes > 15 && minutes <= 30){
            System.out.println( minutes + " minutes are in the second part of the hour");
        } else if (minutes > 30 && minutes <= 45){
            System.out.println( minutes + " minutes are in the third part of the hour");
        } else if (minutes > 45 && minutes <= 60){
            System.out.println( minutes + " minutes are in the fourth part of the hour");
        } else {
            System.out.println("Incorrect value");
        }
    }
}
