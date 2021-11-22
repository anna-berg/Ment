package homeworkFor2111.practice1;

public abstract class Figure {

    public boolean isAreaEqual(Figure figure) {
        return getArea() == figure.getArea();
    }

    public abstract double getArea();
}
