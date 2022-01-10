package virtualmethod.grammar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VerbTest {

    Verb verb;

    @BeforeEach
    void setUp() {
        verb = new Verb("olvas") { };
    }

    @Test
    void getWordTest() {
        assertEquals("olvas", verb.getWord());
    }
}