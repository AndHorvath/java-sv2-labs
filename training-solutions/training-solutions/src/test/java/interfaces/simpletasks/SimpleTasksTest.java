package interfaces.simpletasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SimpleTasksTest {

    SimpleTasks simpleTasks;
    List<String> tasks;

    @BeforeEach
    void setUp() {
        tasks = new ArrayList<>(Arrays.asList("firstTask", "secondTask", "thirdTask"));
        simpleTasks = new SimpleTasks(tasks);
    }

    @Test
    void getTasksTest() {
        assertEquals(tasks, simpleTasks.getTasks());
    }

    @Test
    void runTest() {
        simpleTasks.run();
        assertEquals(0, simpleTasks.getTasks().size());
    }
}