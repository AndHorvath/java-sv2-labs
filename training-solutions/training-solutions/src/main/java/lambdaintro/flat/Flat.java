package lambdaintro.flat;

public class Flat {

    // --- attributes ---------------------------------------------------------

    private String address;
    private double area;
    private int price;

    // --- constructors -------------------------------------------------------

    public Flat(String address, double area, int price) {
        this.address = address;
        this.area = area;
        this.price = price;
    }

    // --- getters and setters ------------------------------------------------

    public String getAddress() { return address; }
    public double getArea() { return area; }
    public int getPrice() { return price; }
}