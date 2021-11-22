package homeworkFor2111.practice1;

public class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle;
    }

    public static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }
}
