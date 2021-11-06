package enumtype.solarsystem;

public class SolarSystemMain {

    public static void main(String[] args) {
        SolarSystem solarSystemA = SolarSystem.EARTH;
        SolarSystem solarSystemB = SolarSystem.SATURN;
        int numberOfMoons;

        numberOfMoons = solarSystemA.getNumberOfMoons();
        System.out.println(numberOfMoons);
        numberOfMoons = solarSystemB.getNumberOfMoons();
        System.out.println(numberOfMoons);
    }
}