package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    Books books;

    @TempDir
    File temporaryFolder;

    @BeforeEach
    void setUp() {
        books = new Books();
    }

    @Test
    void formatListTest() {
        List<String> listToFormat = Arrays.asList(
                "G 25;Egri csillagok;Gárdonyi Géza", "M 79;Pál utcai fiúk;Molnár Ferenc"
        );
        List<String> expectedResult = Arrays.asList(
                "Gárdonyi Géza: Egri csillagok", "Molnár Ferenc: Pál utcai fiúk"
        );
        assertEquals(expectedResult, books.formatList(listToFormat));
    }

    @Test
    void readListTest() {
        Path path = Paths.get("src/test/resources/books.txt");
        List<String> expected = Arrays.asList(
                "G 25;Egri csillagok;Gárdonyi Géza", "M 79;Pál utcai fiúk;Molnár Ferenc"
        );
        assertEquals(expected, books.readList(path));
    }

    @Test
    void readListTestException() {
        Path wrongPath = Paths.get("src/test/resources/bookswrong.txt");
        IllegalStateException exception = assertThrows(
                IllegalStateException.class, () -> books.readList(wrongPath)
        );
        assertEquals("Cannot read file.", exception.getMessage());
    }

    @Test
    void writeListTest() throws IOException {
        Path path = temporaryFolder.toPath().resolve("bookstemp.txt");
        List<String> booksToWrite = Arrays.asList(
                "Gárdonyi Géza: Egri csillagok", "Molnár Ferenc: Pál utcai fiúk"
        );
        books.writeList(path, booksToWrite);

        List<String> booksWritten = Files.readAllLines(path);
        assertEquals(booksToWrite, booksWritten);

        System.out.println(path);
    }
}