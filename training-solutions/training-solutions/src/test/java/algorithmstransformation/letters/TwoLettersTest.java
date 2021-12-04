package algorithmstransformation.letters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    TwoLetters twoLetters;
    List<String> words;

    @BeforeEach
    void setUp() {
        twoLetters = new TwoLetters();
        words = Arrays.asList(
                "iterate", "isolate", "uptown", "toy", "use"
        );
    }

    @Test
    void getFirstTwoLettersTest() {
        List<String> expectedResult = Arrays.asList(
                "it", "is", "up", "to", "us"
        );
        assertEquals(expectedResult, twoLetters.getFirstTwoLetters(words));
    }
}