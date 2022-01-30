package searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BookSearchTest {

    BookSearch bookSearch;
    Book book;
    Throwable exception;

    @BeforeEach
    void setUp() {
        bookSearch = new BookSearch(new ArrayList<>(List.of(
            new Book(1, "Author A", "Title A"),
            new Book(2, "Author B", "Title B"),
            new Book(3, "Author C", "Title C")
        )));
    }

    @Test
    void getBooksTest() {
        List<Book> expected = new ArrayList<>(List.of(
            new Book(1, "Author A", "Title A"),
            new Book(2, "Author B", "Title B"),
            new Book(3, "Author C", "Title C")
        ));
        assertEquals(expected, bookSearch.getBooks());
    }

    @Test
    void findBookByAuthorTitleTest() {
        book = new Book(0, "Author B", "Title B");
        assertEquals(book, bookSearch.findBookByAuthorTitle("Author B", "Title B"));

        exception = assertThrows(
            IllegalArgumentException.class, () -> bookSearch.findBookByAuthorTitle("Author B", ""));
        assertEquals("Author and title can neither be null nor empty.", exception.getMessage());
        exception = assertThrows(
            IllegalStateException.class, () -> bookSearch.findBookByAuthorTitle("Author D", "Title C"));
        assertEquals("Specified book is not in the library's collection.", exception.getMessage());
    }
}