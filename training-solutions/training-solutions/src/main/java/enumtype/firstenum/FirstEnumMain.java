package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {

    public static void main(String[] args) {

        // --- Kontinensek ----------------------------------------------------

        for (Continent continent : Continent.values()) {
            System.out.println(continent);
        }
        System.out.println(Arrays.toString(Continent.values()));

        // --- Óceánok --------------------------------------------------------

        for (Ocean ocean : Ocean.values()) {
            System.out.println(Ocean.valueOf(ocean.name()));
        }

        // --- Foci -----------------------------------------------------------

        for (Football football : Football.values()) {
            System.out.println(football.name());
        }
    }
}