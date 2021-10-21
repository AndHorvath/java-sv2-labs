package classstructureintegrate;

public class Product {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int price;

    // --- getters and setters ------------------------------------------------

    public String getName() { return this.name; }
    public int getPrice() { return this.price; }

    // --- constructors -------------------------------------------------------

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // --- public methods -----------------------------------------------------

    public void increasePrice(int amount) { this.price += amount; }
    public void decreasePrice(int amount) { this.price -= amount; }
}