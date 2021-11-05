package composition.realestate;

public class RealEstate {

    // --- attributes ---------------------------------------------------------

    private String title;
    private double price;
    private Details details;

    // --- constructors -------------------------------------------------------

    public RealEstate(String title, double price, Details details) {
        this.title = title;
        this.price = price;
        this.details = details;
    }

    // --- getters and setters ------------------------------------------------

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Details getDetails() { return details; }
    public void setDetails(Details details) { this.details = details; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return title + " " + price + " " + details.toString();
    }
}