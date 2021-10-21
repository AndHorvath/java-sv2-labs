package classstructureconstructors;

public class Book {

    // --- attributes ---------------------------------------------------------

    private String author;
    private String title;
    private String regNumber;

    // --- getters and setters ------------------------------------------------

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    // --- constructors -------------------------------------------------------

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    // --- public methods -----------------------------------------------------

    public void register(String regNumber) {
        this.regNumber = regNumber;
    }
}
