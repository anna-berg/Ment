package homeworkFor2111.practice1;

/**
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
public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        double xPow = Math.pow(x - point.x, 2.0);
        double yPow = Math.pow(y - point.y, 2.0);
        return Math.sqrt(xPow + yPow);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

