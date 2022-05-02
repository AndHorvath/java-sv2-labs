package lambdastreams.bookstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book;

    @BeforeEach
    void setUp() {
        book = new Book("The Title", 2000, 1234, 100);
    }

    @Test
    void testGetTitle() {
        assertEquals("The Title", book.getTitle());
    }

    @Test
    void testGetPublicationYear() {
        assertEquals(2000, book.getPublicationYear());
    }

    @Test
    void testGetPrice() {
        assertEquals(1234, book.getPrice());
    }

    @Test
    void testGetAmount() {
        assertEquals(100, book.getAmount());
    }
}