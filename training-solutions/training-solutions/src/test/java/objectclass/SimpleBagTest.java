package objectclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBagTest {

    SimpleBag simpleBag;
    Book book;
    Beer beer;

    @BeforeEach
    void setUp() {
        book = new Book("Shakespeare", "Hamlet");
        beer = new Beer("Guinness", 500);
        simpleBag = new SimpleBag();

        simpleBag.putItem(book);
        simpleBag.putItem(beer);
    }

    @Test
    void getItemsTest() {
        assertEquals(Arrays.asList(book, beer), simpleBag.getItems());
    }

    @Test
    void getCursorTest() {
        assertEquals(-1, simpleBag.getCursor());
    }

    @Test
    void putItemTest() {
        simpleBag.putItem(beer);
        assertEquals(Arrays.asList(book, beer, beer), simpleBag.getItems());
    }

    @Test
    void beforeFirstTest() {
        simpleBag.next();
        simpleBag.next();
        assertEquals(1, simpleBag.getCursor());

        simpleBag.beforeFirst();
        assertEquals(-1, simpleBag.getCursor());
    }

    @Test
    void isEmptyTest() {
        assertFalse(simpleBag.isEmpty());
        assertTrue(new SimpleBag().isEmpty());
    }

    @Test
    void containsTest() {
        assertTrue(simpleBag.contains(book));
        assertFalse(new SimpleBag().contains(book));
    }

    @Test
    void hasNextTest() {
        simpleBag.next();
        assertTrue(simpleBag.hasNext());

        simpleBag.next();
        assertFalse(simpleBag.hasNext());
    }

    @Test
    void sizeTest() {
        assertEquals(2, simpleBag.size());
    }

    @Test
    void nextTest() {
        assertEquals(book, simpleBag.next());
        assertEquals(beer, simpleBag.next());

        IllegalStateException exception = assertThrows(
                IllegalStateException.class, () -> simpleBag.next());
        assertEquals("No more items in the bag.", exception.getMessage());
    }
}