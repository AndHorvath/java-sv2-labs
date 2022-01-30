package searching;

import java.util.Objects;

public class Book implements Comparable<Book> {

    // --- attributes ---------------------------------------------------------

    private int id;
    private String author;
    private String title;

    // --- constructors -------------------------------------------------------

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    // --- getters and setters ------------------------------------------------

    public int getId() { return id; }
    public String getAuthor() { return author; }
    public String getTitle() { return title; }

    // --- public methods -----------------------------------------------------

    @Override
    public int compareTo(Book o) {
        if (!author.equals(o.author)) {
            return author.compareTo(o.author);
        } else {
            return title.compareTo(o.title);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}