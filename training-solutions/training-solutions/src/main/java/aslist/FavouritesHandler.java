package aslist;

import java.util.Scanner;

public class FavouritesHandler {

    public void askForFavouriteThing(Scanner scanner, Favourites favourites, String thing) {
        String favouriteThing;

        System.out.println("Please, enter your favourite " + thing + ".");
        favouriteThing = scanner.nextLine();
        favourites.getFavouriteThings().add(favouriteThing);
    }

    public void printFavouriteThingsList(Scanner scanner, Favourites favourites) {
        String favouriteThingsResult = "";

        for (String favouriteThing : favourites.getFavouriteThings()) {
            favouriteThingsResult += favouriteThing + ", ";
        }
        favouriteThingsResult = favouriteThingsResult.substring(0, favouriteThingsResult.length() - 2);

        System.out.println(
                "Your favourite things are: " + favouriteThingsResult + ". " +
                "Currently, there are " + favourites.getFavouriteThings().size() + " listed.");
    }
}