package lambdastreams.bookstore;

public class Book {

    // --- attributes ---------------------------------------------------------

    private String title;
    private int publicationYear;
    private int price;
    private int amount;

    // --- constructors -------------------------------------------------------

    public Book(String title, int publicationYear, int price, int amount) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
        this.amount = amount;
    }

    // --- getters and setters ------------------------------------------------

    public String getTitle() { return title; }
    public int getPublicationYear() { return publicationYear; }
    public int getPrice() { return price; }
    public int getAmount() { return amount;}
}