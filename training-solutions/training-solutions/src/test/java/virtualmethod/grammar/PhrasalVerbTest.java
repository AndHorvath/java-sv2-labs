package virtualmethod.grammar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PhrasalVerbTest {

    PhrasalVerb phrasalVerb;

    @BeforeEach
    void setUp() {
        phrasalVerb = new PhrasalVerb("olvas", "el");
    }

    @Test
    void getPrepositionTest() {
        assertEquals("el", phrasalVerb.getPreposition());
    }

    @Test
    void getWholeWordTest() {
        assertEquals("elolvas", phrasalVerb.getWholeWord());
    }
}