package homeworkFor2111.homeworkSpace;

public class SpaceRunner {

    public static void main(String[] args) {

        Planet earth = new Planet("Earth", 12345, 25463);
        Satellite moon = new Satellite("Moon", 36131, 25460, earth);

        earth.setSatellites(new Satellite[]{moon});
        Star sun = new Star(458756, 58.278);
        moon.getDistanceToPlanet();
        System.out.println("Comparing mass Earth and Moon" + earth.compareMass(moon));


        Planet mars = new Planet("Mars", 65866, 648463);
        System.out.println(SpaceUtils.forceGravity(earth, mars));
        System.out.println(SpaceUtils.isStar(sun));

        sun.setPlanets(new Planet[]{earth, mars});
        System.out.println(sun);
    }
}
