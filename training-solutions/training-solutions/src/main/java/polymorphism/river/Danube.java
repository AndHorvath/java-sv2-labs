package polymorphism.river;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Danube extends River {

    // --- attributes ---------------------------------------------------------

    private List<String> capitals;

    // --- constructors -------------------------------------------------------

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getCapitals() { return capitals; }

    // --- public methods -----------------------------------------------------

    public static void main(String[] args) {
        List<String> capitals = new ArrayList<>(Arrays.asList("Vienna", "Bratislava", "Budapest", "Belgrade"));

        Water danubeWater = new Danube("DanubeWater", 2850, capitals);
        River danubeRiver = new Danube("DanubeRiver", 2850, capitals);
        Danube danubeDanube = new Danube("DanubeDanube", 2850, capitals);

        System.out.println(danubeWater.getClass());
        System.out.println();

        System.out.println(danubeRiver.getClass());
        System.out.println(danubeRiver.getName());
        System.out.println(danubeRiver.getLength());
        System.out.println();

        System.out.println(danubeDanube.getClass());
        System.out.println(danubeDanube.getName());
        System.out.println(danubeDanube.getLength());
        System.out.println(danubeDanube.getCapitals());
    }
}