package lambdastreams.bookstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BookStoreTest {

    BookStore bookStore;
    BookStore other;

    Book bookA;
    Book bookB;
    Book bookC;
    Book bookD;

    @BeforeEach
    void setUp() {
        bookA = new Book("Title A", 2001, 1_000, 400);
        bookB = new Book("Title B", 2003, 2_000, 300);
        bookC = new Book("Title C", 2000, 3_000, 200);
        bookD = new Book("Title D", 2004, 4_000, 100);

        bookStore = new BookStore(
            new ArrayList<>(Arrays.asList(bookA, bookB, bookC, bookD))
        );
        other = new BookStore();
    }

    @Test
    void testGetBooks() {
        assertEquals(List.of(bookA, bookB, bookC, bookD), bookStore.getBooks());
        assertEquals(List.of(), other.getBooks());
    }

    @Test
    void testGetNumberOfBooks() {
        assertEquals(1_000, bookStore.getNumberOfBooks());
        assertEquals(0, other.getNumberOfBooks());
    }

    @Test
    void testFindNewestBook() {
        assertEquals(bookD, bookStore.findNewestBook().orElseThrow());
        assertEquals(Optional.empty(), other.findNewestBook());
    }

    @Test
    void testGetTotalValue() {
        assertEquals(2_000_000, bookStore.getTotalValue());
        assertEquals(0, other.getTotalValue());
    }
}