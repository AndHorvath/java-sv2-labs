package algorithmsfilter.prefix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    Prefix prefix;
    List<String> words;
    String testPrefix;

    @BeforeEach
    void setUp() {
        prefix = new Prefix();
        words = Arrays.asList(
                "prevent", "prejudice", "process", "prepare", "project", "program", "prefer"
        );
        testPrefix = "pre";
    }

    @Test
    void getWordsStartWithTest() {
        List<String> expectedResult = Arrays.asList(
                "prevent", "prejudice", "prepare", "prefer"
        );
        assertEquals(expectedResult, prefix.getWordsStartWith(words, testPrefix));
    }
}