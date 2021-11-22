package homeworkFor2111.homeworkSpace;

import java.util.Arrays;

public class Star extends SpaceObject implements CanShine, HasPlanet {

    private final long mass;
    private final double visualShine;
    private Planet[] planets;

    public Star(long mass, double visualShine) {
        this.mass = mass;
        this.visualShine = visualShine;
    }

    @Override
    protected long getMass() {
        return mass;
    }

    @Override
    public double compareBrillianceAndHoliness(CanShine canShine) {
        return visualShine - canShine.getVisualShine();
    }

    @Override
    public double getVisualShine() {
        return visualShine;
    }

    public void setPlanets(Planet[] planets) {
        this.planets = planets;
    }

    @Override
    public Planet[] getPlanet() {
        return planets;
    }

    @Override
    public String toString() {
        return "Star{" +
                "mass=" + mass +
                ", visualShine=" + visualShine +
                ", planets=" + Arrays.toString(planets) +
                '}';
    }
}
