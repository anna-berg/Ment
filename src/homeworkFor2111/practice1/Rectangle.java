package homeworkFor2111.practice1;

/**
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
public class Rectangle extends Figure implements WithDiagonal {

    private Point leftUp;
    private Point rightDown;

    public Rectangle(Point leftUp, Point leftDown) {
        this.leftUp = leftUp;
        this.rightDown = leftDown;
    }

    public double getDiagonal() {
        return rightDown.distance(leftUp);
    }

    public double getArea() {
        return (rightDown.getX() - leftUp.getX()) * (rightDown.getY() - leftUp.getY());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftUp=" + leftUp +
                ", rightDown=" + rightDown +
                '}';
    }

    public Point getLeftUp() {
        return leftUp;
    }

    public Point getRightDown() {
        return rightDown;
    }
}
