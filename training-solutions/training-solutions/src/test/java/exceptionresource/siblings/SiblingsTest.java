package exceptionresource.siblings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    Siblings siblings;
    Path path;
    List<String> fullNames;
    Throwable exception;

    @BeforeEach
    void setUp() {
        siblings = new Siblings();
        path = Path.of("src/test/resources/siblings.txt");
    }

    @Test
    void getFullNamesTest() {
        fullNames = new ArrayList<>(Arrays.asList("Szabó Emese", "Szabó Ferenc"));
        assertEquals(fullNames, siblings.getFullNames("Szabó", path));
    }

    @Test
    void getFullNamesTestInvalid() {
        path = Path.of("src/test/resources/siblings_.txt");
        exception = assertThrows(IllegalStateException.class, () -> siblings.getFullNames("Szabó", path));
        assertEquals("Cannot read file.", exception.getMessage());
        assertTrue(exception.getCause() instanceof IOException);
    }
}