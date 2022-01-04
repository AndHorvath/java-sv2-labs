package statemachine.typewriter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void nextTest() {
        assertEquals(TypeWriterState.UPPERCASE, TypeWriterState.LOWERCASE.next());
        assertEquals(TypeWriterState.LOWERCASE, TypeWriterState.UPPERCASE.next());
    }
}