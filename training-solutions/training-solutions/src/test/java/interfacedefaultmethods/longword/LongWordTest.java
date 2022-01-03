package interfacedefaultmethods.longword;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    LongWord longWord;
    Path path;

    @BeforeEach
    void setUp() {
        path = Path.of("src/test/resources/longword.txt");
        longWord = new LongWord(path);
    }

    @Test
    void getLongWordPathTest() {
        assertEquals(path, longWord.getLongWordPath());
    }

    @Test
    void getLongWordTest() {
        assertEquals("LONGWORD", longWord.getLongWord());
    }
}