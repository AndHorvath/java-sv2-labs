package immutable;

import java.time.LocalDate;

public class Car {

    // --- attributes ---------------------------------------------------------

    private final String brand;
    private final String type;
    private final int yearOfProduction;

    // --- constructors -------------------------------------------------------

    public Car(String brand, String type, int yearOfProduction) {
        validateParameters(brand, yearOfProduction);

        this.brand = brand;
        this.type = type;
        this.yearOfProduction = yearOfProduction;
    }

    // --- getters and setters ------------------------------------------------

    public String getBrand() { return brand; }
    public String getType() { return type; }
    public int getYearOfProduction() { return yearOfProduction; }

    // --- private methods ----------------------------------------------------

    private void validateParameters(String brand, int yearOfProduction) {
        validateBrand(brand);
        validateYearOfProduction(yearOfProduction);
    }

    private void validateBrand(String brand) {
        if (brand == null || brand.trim().length() == 0) {
            throw new IllegalArgumentException("Brand name cannot be empty.");
        }
    }

    private void validateYearOfProduction(int yearOfProduction) {
        if (yearOfProduction > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year of production cannot be in the future.");
        }
    }
}