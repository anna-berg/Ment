package homeworkFor2111.homeworkSpace;

public class Asteroid extends SpaceObject implements CanShine {
    private final double visualShine;
    private final long mass;

    public Asteroid(double visualShine, long mass) {
        this.visualShine = visualShine;
        this.mass = mass;
    }

    @Override
    public double compareBrillianceAndHoliness(CanShine canShine) {
        return canShine.getVisualShine() - visualShine;
    }

    @Override
    public double getVisualShine() {
        return visualShine;
    }

    @Override
    protected long getMass() {
        return (long) (mass - 2 * visualShine);
    }
}
