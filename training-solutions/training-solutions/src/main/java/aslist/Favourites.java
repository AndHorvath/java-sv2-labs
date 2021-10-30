package aslist;

import java.util.List;
import java.util.ArrayList;

public class Favourites {

    private final List<String> favouriteThings;

    public Favourites() { favouriteThings = new ArrayList<>(); }

    public List<String> getFavouriteThings() { return favouriteThings; }
}