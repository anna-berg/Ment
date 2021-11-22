package homeworkFor2111.practice1;

/**
 * Внимание. При выполнении задания держите в уме принцип инкапсуляции.
 * <p>
 * Создать класс Point, описывающий точку в двумерных координатах.
 * <p>
 * Полями этого класса должны быть координаты x и y.
 * <p>
 * Класс должен иметь один конструктор, принимающий координаты x и y.
 * <p>
 * Добавьте функционал для получения скрытой информации (координаты точки), а получить её можно только с помощью методов доступа (get/set).
 * <p>
 * Создать метод distance, принимающий объект Point и определяющий расстояние до неё.
 * <p>
 * Используя класс точки, создать класс Rectangle, описывающий прямоугольник.
 * <p>
 * В нём хранятся два поля типа Point - координаты левого верхнего и правого нижнего углов.
 * <p>
 * Создать следующие методы в классе Rectangle:
 * <p>
 * - Высчитывающий площадь прямоугольника
 * <p>
 * - Высчитывающий длину диагонали
 * <p>
 * Написать тестовый класс с методом main программу, демонстрирующим создание объекта класса Rectangle и применение вышеперечисленных методов.
 */
public class FigureRunner {

    public static void main(String[] args) {

        Point point1 = new Point(2, 10);
        Point point2 = new Point(12, 4);

        System.out.println(point1.distance(point2));
        System.out.println(point2.distance(point1));

        Rectangle rectangle = new Rectangle(point1, point2);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getDiagonal());
    }
}
