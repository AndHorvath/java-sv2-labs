package genericsusage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book;

    @BeforeEach
    void setUp() {
        book = new Book("Title");
    }

    @Test
    void getTitleTest() {
        assertEquals("Title", book.getTitle());
    }
}