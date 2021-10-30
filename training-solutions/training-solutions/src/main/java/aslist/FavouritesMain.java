package aslist;

import java.util.Scanner;

public class FavouritesMain {

    public static void main(String[] args) {
        FavouritesHandler favouritesHandler = new FavouritesHandler();
        Scanner scanner = new Scanner(System.in);
        Favourites favourites = new Favourites();

        favouritesHandler.askForFavouriteThing(scanner, favourites, "Movie");
        favouritesHandler.askForFavouriteThing(scanner, favourites, "Author");
        favouritesHandler.askForFavouriteThing(scanner, favourites, "dish");

        favouritesHandler.printFavouriteThingsList(scanner, favourites);
    }
}
