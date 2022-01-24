package collectionsqueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ToDoTest {

    ToDo toDo;

    @BeforeEach
    void setUp() {
        toDo = new ToDo("ToDo", true);
    }

    @Test
    void getDescriptionTest() {
        assertEquals("ToDo", toDo.getDescription());
    }

    @Test
    void isUrgentTest() {
        assertTrue(toDo.isUrgent());
    }

    @Test
    void testToStringTest() {
        assertEquals("ToDo: true", toDo.toString());
    }
}