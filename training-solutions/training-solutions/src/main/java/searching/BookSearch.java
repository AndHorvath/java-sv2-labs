package searching;

import java.util.Collections;
import java.util.List;

public class BookSearch {

    // --- attributes ---------------------------------------------------------

    private List<Book> books;

    // --- constructors -------------------------------------------------------

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    // --- getters and setters ------------------------------------------------

    public List<Book> getBooks() { return books; }

    // --- public methods -----------------------------------------------------

    public Book findBookByAuthorTitle(String author, String title) {
        validateParameter(author, title);
        int specifiedIndex = Collections.binarySearch(books, new Book(0, author, title));
        if (specifiedIndex < 0) {
            throw new IllegalStateException("Specified book is not in the library's collection.");
        }
        return books.get(specifiedIndex);
    }

    // --- private methods ----------------------------------------------------

    private void validateParameter(String author, String title) {
        if (author == null || author.trim().isEmpty() || title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Author and title can neither be null nor empty.");
        }
    }
}