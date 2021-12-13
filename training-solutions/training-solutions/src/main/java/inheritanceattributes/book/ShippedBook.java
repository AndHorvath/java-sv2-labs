package inheritanceattributes.book;

public class ShippedBook extends Book {

    // --- attributes ---------------------------------------------------------

    private int shippingCost;

    // --- constructors -------------------------------------------------------

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    // --- getters and setters ------------------------------------------------

    public int getShippingCost() { return shippingCost; }

    // --- public methods -----------------------------------------------------

    public int order(int pieces) {
        return price * pieces + shippingCost;
    }

    @Override
    public String toString() {
        return getTitle() + ": " + price + " Ft, postaköltség: " + shippingCost + " Ft";
    }
}