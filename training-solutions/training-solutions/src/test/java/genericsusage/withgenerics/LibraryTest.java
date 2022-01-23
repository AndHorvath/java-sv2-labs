package genericsusage.withgenerics;

import genericsusage.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library;
    Book bookA;
    Book bookB;
    List<Book> books;
    Throwable exception;

    @BeforeEach
    void setUp() {
        library = new Library();
        bookA = new Book("Title A");
        bookB = new Book("Title B");
    }

    @Test
    void getFirstBookTest() {
        books = new ArrayList<>(List.of(bookA, bookB));
        assertEquals(bookA, library.getFirstBook(books));
    }

    @Test
    void getFirstBookTestNull() {
        books = null;
        exception = assertThrows(NullPointerException.class, () -> library.getFirstBook(books));
        assertEquals("Collection is null.", exception.getMessage());
    }

    @Test
    void getFirstBookTestEmpty() {
        books = new ArrayList<>();
        exception = assertThrows(IllegalArgumentException.class, () -> library.getFirstBook(books));
        assertEquals("Collection is empty.", exception.getMessage());
    }
}