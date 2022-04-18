package lambdaintro.flat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RealEstateAgency {

    // --- attributes ---------------------------------------------------------

    private List<Flat> flats;
    private static final double EPSILON = Math.pow(10.0, -5.0);

    // --- constructors -------------------------------------------------------

    public RealEstateAgency() {
        flats = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Flat> getFlats() { return flats; }

    // --- public methods -----------------------------------------------------

    public void addFlat(Flat flat) {
        flats.add(flat);
    }

    public Flat findFirstCheaperFlat(int maxPrice) {
        return findFirst(flat -> flat.getPrice() < maxPrice);
    }

    public Flat findFirstGreaterFlat(double minArea) {
        return findFirst(flat -> isGreater(flat.getArea(), minArea));
    }

    public Flat findFirstFlatInSameTown(String town) {
        return findFirst(flat -> isInSameTown(flat, town));
    }

    // --- private methods ----------------------------------------------------

    private Flat findFirst(Predicate<Flat> condition) {
        for (Flat flat : flats) {
            if (condition.test(flat)) {
                return flat;
            }
        }
        throw new IllegalArgumentException("No flat with specified condition.");
    }

    private boolean isGreater(double value, double other) {
        return value > other + EPSILON;
    }

    private boolean isInSameTown(Flat flat, String town) {
        String townInAddress = flat.getAddress().split(", ")[1];
        String townName = townInAddress.split(" ")[0];
        return town.equals(townName);
    }
}