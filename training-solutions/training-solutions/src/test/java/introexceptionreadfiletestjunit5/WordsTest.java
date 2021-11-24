package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    Words words;
    String word;
    Path path;

    @BeforeEach
    void setUp() {
        words = new Words();
    }

    @Test
    void getFirstWordWithATestWithA() {
        path = Paths.get("src/test/resources/words.txt");
        word = words.getFirstWordWithA(path);
        assertEquals("Anna", word);
    }

    @Test
    void getFirstWordWithATestWithoutA() {
        path = Paths.get("src/test/resources/wordswithoutA.txt");
        word = words.getFirstWordWithA(path);
        assertEquals("A", word);
    }

    @Test
    void getFirstWordWithATestWithEmpty() {
        path = Paths.get("src/test/resources/wordswithempty.txt");
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> words.getFirstWordWithA(path));
        assertEquals("Invalid word entry.", exception.getMessage());
    }

    @Test
    void getFirstWordWithATestWithoutFile() {
        path = Paths.get("src/test/resources/wordswithoutfile.txt");
        IllegalStateException exception = assertThrows(
                IllegalStateException.class, () -> words.getFirstWordWithA(path));
        assertEquals("Cannot read file.", exception.getMessage());
    }
}