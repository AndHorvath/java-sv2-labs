package collectionsqueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    ToDoList toDoList;

    @BeforeEach
    void setUp() {
        toDoList = new ToDoList();
    }

    @Test
    void getToDosTest() {
        assertEquals(new ArrayList<>(), toDoList.getToDos());
    }

    @Test
    void addToDoTest() {
        toDoList.addToDo(new ToDo("ToDo", true));
        assertEquals(1, toDoList.toDos.size());
        assertEquals("ToDo: true", toDoList.getToDos().get(0).toString());
    }

    @Test
    void getToDosInUrgencyOrderTest() {
        toDoList.addToDo(new ToDo("ToDo A", false));
        toDoList.addToDo(new ToDo("ToDo B", true));
        toDoList.addToDo(new ToDo("ToDo C", true));
        toDoList.addToDo(new ToDo("ToDo D", false));
        toDoList.addToDo(new ToDo("ToDo E", false));
        toDoList.addToDo(new ToDo("ToDo F", true));

        assertEquals(
            "[ToDo F: true, ToDo C: true, ToDo B: true, ToDo A: false, ToDo D: false, ToDo E: false]",
            toDoList.getToDosInUrgencyOrder().toString());
        assertEquals("ToDo F: true", toDoList.getToDosInUrgencyOrder().pop().toString());
    }
}