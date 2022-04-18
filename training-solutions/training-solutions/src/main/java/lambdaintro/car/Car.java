package lambdaintro.car;

public class Car {

    // --- attributes ---------------------------------------------------------

    private String brand;
    private String  type;
    private int price;
    private double length;

    // --- constructors -------------------------------------------------------

    public Car(String brand, String type, int price, double length) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.length = length;
    }

    // --- getters and setters ------------------------------------------------

    public String getBrand() { return brand; }
    public String getType() { return type; }
    public int getPrice() { return price; }
    public double getLength() { return length; }
}