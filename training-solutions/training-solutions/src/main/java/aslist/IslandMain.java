package aslist;

import java.util.Scanner;

public class IslandMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] importantThings = { "medicine", "book", "instrument" };
        String thingToChange;
        String newThing;
        Island island;

        island = new Island(importantThings[0], importantThings[1], importantThings[2]);
        island.printImportantThings();

        System.out.println("Now, you can change an item. What would you leave at home?");
        thingToChange = scanner.nextLine();
        System.out.println("And what would you take with you instead?");
        newThing = scanner.nextLine();

        island.changeOneThingForAnother(thingToChange, newThing);
        island.printImportantThings();
    }
}
