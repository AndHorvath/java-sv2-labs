package lambdaoptional.costume;

public class Costume {

    // --- attributes ---------------------------------------------------------

    private String description;
    private Size size;
    private int price;

    // --- constructors -------------------------------------------------------

    public Costume(String description, Size size, int price) {
        this.description = description;
        this.size = size;
        this.price = price;
    }

    // --- getters and setters ------------------------------------------------

    public String getDescription() { return description; }
    public Size getSize() { return size; }
    public int getPrice() { return price; }
}