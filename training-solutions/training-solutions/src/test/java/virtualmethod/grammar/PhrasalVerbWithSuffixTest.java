package virtualmethod.grammar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PhrasalVerbWithSuffixTest {

    PhrasalVerbWithSuffix phrasalVerbWithSuffix;

    @BeforeEach
    void setUp() {
        phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("olvas", "el", "tad");
    }

    @Test
    void getSuffixTest() {
        assertEquals("tad", phrasalVerbWithSuffix.getSuffix());
    }

    @Test
    void getWholeWordTest() {
        assertEquals("elolvastad", phrasalVerbWithSuffix.getWholeWord());
    }
}