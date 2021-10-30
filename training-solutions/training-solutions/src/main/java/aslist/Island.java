package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Island {

    // --- attributes ---------------------------------------------------------

    private final List<String> importantThings;

    // --- constructors -------------------------------------------------------

    public Island(String firstThing, String secondThing, String thirdThing) {
        importantThings = Arrays.asList(firstThing, secondThing, thirdThing);
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getImportantThings() { return importantThings; }

    // --- public methods -----------------------------------------------------

    public void changeOneThingForAnother(String thingToChange, String newThing) {
        int oldThingIndex;

        oldThingIndex = importantThings.indexOf(thingToChange);
        importantThings.set(oldThingIndex, newThing);
    }

    public void printImportantThings() {
        String importantThingsResult = "";
        int importantThingsSize = importantThings.size();

        for (int i = 0; i < importantThingsSize; i++) {
            importantThingsResult += importantThings.get(i) + (i !=  importantThingsSize - 1 ? ", "  : "");
        }
        System.out.println("To a lonely island you would take: " + importantThingsResult + ".");
    }
}