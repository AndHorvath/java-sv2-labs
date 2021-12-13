package objectclass;

public class Book {

    // --- attributes ---------------------------------------------------------

    private String author;
    private String title;

    // --- constructors -------------------------------------------------------

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    // --- getters and setters ------------------------------------------------

    public String getAuthor() { return author; }
    public String getTitle() { return title; }
}