package streams;

import java.util.List;

public class Read {

    // --- attributes ---------------------------------------------------------

    private List<Book> books;

    // --- constructors -------------------------------------------------------

    public Read(List<Book> books) {
        this.books = books;
    }

    // --- getters and setters ------------------------------------------------

    public List<Book> getBooks() { return books; }

    // --- public methods -----------------------------------------------------

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages) {
        return books.stream()
            .filter(book -> book.getNumberOfPages() < maxNumberOfPages)
            .map(Book::getTitle)
            .toList();
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {
        return books.stream()
            .filter(book -> book.getAuthor().equals(author))
            .map(Book::getTitle)
            .sorted()
            .toList();
    }

    public List<String> listAuthors() {
        return books.stream()
            .map(Book::getAuthor)
            .distinct()
            .sorted()
            .toList();
    }
}