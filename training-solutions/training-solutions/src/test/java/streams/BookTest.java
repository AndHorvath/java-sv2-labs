package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book;

    @BeforeEach
    void setUp() {
        book = new Book("Author", "Title", 100);
    }

    @Test
    void getAuthorTest() {
        assertEquals("Author", book.getAuthor());
    }

    @Test
    void getTitleTest() {
        assertEquals("Title", book.getTitle());
    }

    @Test
    void getNumberOfPagesTest() {
        assertEquals(100, book.getNumberOfPages());
    }
}