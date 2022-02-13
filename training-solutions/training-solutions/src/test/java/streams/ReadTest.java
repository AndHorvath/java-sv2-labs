package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadTest {

    Read read;
    List<Book> books;

    @BeforeEach
    void setUp() {
        books = new ArrayList<>(List.of(
            new Book("Author A", "Title AB", 100), new Book("Author A", "Title AA", 200),
            new Book("Author C", "Title CB", 300), new Book("Author C", "Title CA", 400),
            new Book("Author B", "Title BB", 500), new Book("Author B", "Title BA", 600)

            ));
        read = new Read(books);
    }

    @Test
    void getBooksTest() {
        assertEquals(books, read.getBooks());
    }

    @Test
    void listBookTitlesShorterThanGivenTest() {
        assertEquals(
            new ArrayList<>(List.of("Title AB", "Title AA", "Title CB")),
            read.listBookTitlesShorterThanGiven(400)
        );
    }

    @Test
    void listBookTitlesWithGivenAuthorTest() {
        assertEquals(
            new ArrayList<>(List.of("Title CA", "Title CB")),
            read.listBookTitlesWithGivenAuthor("Author C"));
    }

    @Test
    void listAuthorsTest() {
        assertEquals(
            new ArrayList<>(List.of("Author A", "Author B", "Author C")),
            read.listAuthors()
        );
    }
}