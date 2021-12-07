package methodchain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    ModifiedWord modifiedWord;

    @BeforeEach
    void setUp() {
        modifiedWord = new ModifiedWord();
    }

    @Test
    void modifyWordTest() {
        assertEquals("AxMy", modifiedWord.modifyWord("alma"));
        assertEquals("KxRy", modifiedWord.modifyWord("körte"));
        assertEquals("SxIy", modifiedWord.modifyWord("szilva"));
    }
}