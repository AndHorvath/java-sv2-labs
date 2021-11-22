package introexceptionthrowjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
        student.addNote(4);
    }

    @Test
    void getNotesTest() {
        assertEquals(1, student.getNotes().size());
        assertEquals(4, student.getNotes().get(0));
    }

    @Test
    void addNoteTestHappyPath() {
        student.addNote(5);
        assertEquals(2, student.getNotes().size());
        assertEquals(5, student.getNotes().get(1));
    }

    @Test
    void addNoteTestExceptionalPath() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> student.addNote(6));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}