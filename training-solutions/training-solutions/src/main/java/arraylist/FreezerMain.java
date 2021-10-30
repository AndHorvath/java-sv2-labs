package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FreezerMain {

    public static void main(String[] args) {
        ArrayListHandler arrayListHandler = new ArrayListHandler();
        List<String> thingsInFridge = new ArrayList<>();
        String[] thingsInFridgeArray = { "Eggs", "Cheese", "Pizza", "Onions", "Mushroom" };
        Freezer freezer;

        freezer = new Freezer(thingsInFridge);
        arrayListHandler.fillDynamicListFromStringArray(freezer.getThingsInFridge(), thingsInFridgeArray);
        freezer.printFridgeContentsAndSize();

        freezer.getThingsInFridge().removeAll(Arrays.asList("Mushroom", "Cheese"));
        freezer.printFridgeContentsAndSize();
    }
}