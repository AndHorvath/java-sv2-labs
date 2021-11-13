package junit5fixture;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    Words words;

    @BeforeEach
    void constructWords() {
        words = new Words();
        words.addWord("Ship");
        words.addWord("Shine");
        words.addWord("Soup");
    }

    @Test
    void testGetWordsStartWith() {
        words.getWordsStartWith("Shi");
        List<String> expectedWords = new ArrayList<>(Arrays.asList("Ship", "Shine"));

        assertArrayEquals(expectedWords.toArray(), words.getWords().toArray());
    }

    @Test
    void testGetWordsWithLength() {
        words.getWordsWithLength(4);
        List<String> expectedWords = new ArrayList<>(Arrays.asList("Ship", "Soup"));

        assertArrayEquals(expectedWords.toArray(), words.getWords().toArray());
    }
}