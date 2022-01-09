package polymorphism.river;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class DanubeTest {

    Danube danube;
    List<String> capitals;

    @BeforeEach
    void setUp() {
        capitals = new ArrayList<>(Arrays.asList("Vienna", "Bratislava", "Budapest", "Belgrade"));
        danube = new Danube("Danube", 2850, capitals);
    }

    @Test
    void getNameTest() {
        assertEquals("Danube", danube.getName());
    }

    @Test
    void getLengthTest() {
        assertEquals(2850, danube.getLength());
    }

    @Test
    void getCapitalsTest() {
        assertEquals(capitals, danube.getCapitals());
    }
}