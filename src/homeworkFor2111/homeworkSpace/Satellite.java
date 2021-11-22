package homeworkFor2111.homeworkSpace;

public class Satellite extends SpaceObject {

    private final String name;
    private final long mass;
    private final long distanceToSun;
    private Planet rotationObject;

    public Satellite(String name, long mass, long distanceToSun, Planet rotationObject) {
        this.name = name;
        this.mass = mass;
        this.distanceToSun = distanceToSun;
        this.rotationObject = rotationObject;
    }

    public String getName() {
        return name;
    }

    @Override
    public long getMass() {
        return mass;
    }

    public SpaceObject getRotationObject() {
        return rotationObject;
    }

    public long getDistanceToSun() {
        return distanceToSun;
    }

    public void setRotationObject(Planet planet) {
        this.rotationObject = planet;
    }

    public long getDistanceToPlanet() {
        return Math.abs(distanceToSun - rotationObject.getDistanceToSun());
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", distanceToSun=" + distanceToSun +
                ", rotationObject=" + rotationObject +
                '}';
    }
}
