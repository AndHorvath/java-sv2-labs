package inheritanceattributes.book;

public class Book {

    // --- attributes ---------------------------------------------------------

    private String title;
    protected int price;

    // --- constructors -------------------------------------------------------

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    // --- getters and setters ------------------------------------------------

    public String getTitle() { return title; }

    // --- public methods -----------------------------------------------------

    public int purchase(int pieces) {
        return price * pieces;
    }
}