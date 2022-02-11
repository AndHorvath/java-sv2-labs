package sorting.cardealership;

public class Car {

    // --- attributes ---------------------------------------------------------

    private String brand;
    private int yearOfConstruction;
    private int price;

    // --- constructors -------------------------------------------------------

    public Car(String brand, int yearOfConstruction, int price) {
        this.brand = brand;
        this.yearOfConstruction = yearOfConstruction;
        this.price = price;
    }

    // --- getters and setters ------------------------------------------------

    public String getBrand() { return brand; }
    public int getYearOfConstruction() { return yearOfConstruction; }
    public int getPrice() { return price; }
}