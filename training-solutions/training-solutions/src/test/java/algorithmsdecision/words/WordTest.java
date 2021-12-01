package algorithmsdecision.words;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    Word word;
    List<String> words;
    String lowerBoundWordA;
    String lowerBoundWordB;

    @BeforeEach
    void setUp() {
        word = new Word();
        words = Arrays.asList(
                "way", "road", "drive", "street", "highway"
        );
        lowerBoundWordA = "avenue";
        lowerBoundWordB = "boulevard";
    }

    @Test
    void containsLongerWordTest() {
        assertTrue(word.containsLongerWord(words, lowerBoundWordA));
        assertFalse(word.containsLongerWord(words, lowerBoundWordB));
    }
}