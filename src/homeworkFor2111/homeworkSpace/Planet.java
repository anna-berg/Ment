package homeworkFor2111.homeworkSpace;

import java.util.Arrays;

/**
 * L=2*π*R
 * <p>
 * Т.к. диаметр d=2*R, то формула может быть записана в виде
 * <p>
 * L=π*d
 */
public class Planet extends SpaceObject implements IsRevolving, HasSatellite {
    private final String name;
    private final long mass;
    private final long distanceToSun;
    private Satellite[] satellites;

    public Planet(String name, long mass, long distanceToSun) {
        this.name = name;
        this.mass = mass;
        this.distanceToSun = distanceToSun;
    }

    public String getName() {
        return name;
    }

    public void setSatellites(Satellite[] satellites) {
        this.satellites = satellites;
    }

    @Override
    public long getMass() {
        return mass;
    }

    public long getDistanceToSun() {
        return distanceToSun;
    }

    @Override
    public double distanceToRotationObject() {
        return 0;
    }

    @Override
    public Satellite[] getSatellite() {
        return satellites;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", distanceToSun=" + distanceToSun +
                ", satellites=" + Arrays.toString(satellites) +
                '}';
    }
}
