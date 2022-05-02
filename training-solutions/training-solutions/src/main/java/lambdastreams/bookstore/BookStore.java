package lambdastreams.bookstore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BookStore {

    // --- attributes ---------------------------------------------------------

    private List<Book> books;

    // --- constructors -------------------------------------------------------

    public BookStore() {
        books = new ArrayList<>();
    }

    public BookStore(List<Book> books) {
        this.books = books;
    }

    // --- getters and setters ------------------------------------------------

    public List<Book> getBooks() { return books; }

    // --- public methods -----------------------------------------------------

    public void addBook(Book book) {
        books.add(book);
    }

    public Integer getNumberOfBooks() {
        return books.stream()
            .reduce(0, (n, book) -> n + book.getAmount(), Integer::sum);
    }

    public Optional<Book> findNewestBook() {
        return books.stream()
            .max(Comparator.comparing(Book::getPublicationYear));
    }

    public Integer getTotalValue() {
        return books.stream()
            .reduce(0, (n, book) -> n + book.getPrice() * book.getAmount(), Integer::sum);
    }
}