package searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book bookA;
    Book bookB;
    Book bookC;

    @BeforeEach
    void setUp() {
        bookA = new Book(1, "Author A", "Title A");
        bookB = new Book(2, "Author A", "Title A");
        bookC = new Book(1, "Author A", "Title C");
    }

    @Test
    void getIdTest() {
        assertEquals(1, bookA.getId());
    }

    @Test
    void getAuthorTest() {
        assertEquals("Author A", bookA.getAuthor());
    }

    @Test
    void getTitleTest() {
        assertEquals("Title A", bookA.getTitle());
    }

    @Test
    void compareToTest() {
        assertTrue(bookA.compareTo(bookC) < 0);
    }

    @Test
    void testEqualsTest() {
        assertEquals(bookA, bookB);
    }

    @Test
    void testHashCodeTest() {
        assertEquals(bookA.hashCode(), bookB.hashCode());
    }
}