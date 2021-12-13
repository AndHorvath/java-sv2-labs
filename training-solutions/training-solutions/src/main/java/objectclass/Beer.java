package objectclass;

public class Beer {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int price;

    // --- constructors -------------------------------------------------------

    public Beer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getPrice() { return price; }
}