package objectclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book;

    @BeforeEach
    void setUp() {
        book = new Book("Shakespeare", "Hamlet");
    }

    @Test
    void getAuthorTest() {
        assertEquals("Shakespeare", book.getAuthor());
    }

    @Test
    void getTitleTest() {
        assertEquals("Hamlet", book.getTitle());
    }
}