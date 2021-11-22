package homeworkFor2111.homeworkSpace;

public class SpaceUtils {

    public final static long GRAVITATION_CONST = 667430;

    private SpaceUtils() {
    }

    public static long forceGravity(Planet planet1, Planet planet2) {
        long distance = Math.abs(planet1.getDistanceToSun() - planet2.getDistanceToSun());
        return (long) (GRAVITATION_CONST * ((planet1.getMass() * planet2.getMass()) / Math.pow(distance, 2)));
    }

    public static boolean isStar(SpaceObject spaceObject) {
        return spaceObject instanceof Star;
    }
}
