package streams;

public class Book {

    // --- attributes ---------------------------------------------------------

    String author;
    String title;
    int numberOfPages;

    // --- constructors -------------------------------------------------------

    public Book(String author, String title, int numberOfPages) {
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    // --- getters and setters ------------------------------------------------

    public String getAuthor() { return author; }
    public String getTitle() { return title; }
    public int getNumberOfPages() { return numberOfPages; }
}