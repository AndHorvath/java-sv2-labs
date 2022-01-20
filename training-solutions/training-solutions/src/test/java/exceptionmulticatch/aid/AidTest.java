package exceptionmulticatch.aid;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AidTest {

    Aid aid;
    Path path;
    List<String> amountsOfAid;
    Throwable exception;

    @BeforeEach
    void setUp() {
        aid = new Aid(1_489_600);
        path = Path.of("src/test/resources/population1.txt");
        amountsOfAid = new ArrayList<>(Arrays.asList(
            "Budapest: 1489600", "Kukutyin: 53200", "Kiskunalsófelső: 2800"));
    }

    @Test
    void getAmountTest() {
        assertEquals(1_489_600, aid.getAmount());
    }

    @Test
    void countAmountsOfAidTest() {
        assertEquals(amountsOfAid, aid.countAmountsOfAid(path));
    }

    @Test
    void countAmountsOfAidTestNull() {
        exception = assertThrows(IllegalStateException.class, () -> aid.countAmountsOfAid(null));
        assertEquals("Something went wrong while counting.", exception.getMessage());
        assertEquals(NullPointerException.class, exception.getCause().getClass());
    }

    @Test
    void countAmountsOfAidTestInvalidPath() {
        path = Path.of("src/test/resources/population_1.txt");
        exception = assertThrows(IllegalStateException.class, () -> aid.countAmountsOfAid(path));
        assertEquals("Something went wrong while counting.", exception.getMessage());
        assertTrue(exception.getCause() instanceof IOException);
    }

    @Test
    void countAmountsOfAidTestInvalidLine() {
        path = Path.of("src/test/resources/population2.txt");
        exception = assertThrows(IllegalStateException.class, () -> aid.countAmountsOfAid(path));
        assertEquals("Something went wrong while counting.", exception.getMessage());
        assertEquals(ArrayIndexOutOfBoundsException.class, exception.getCause().getClass());
    }

    @Test
    void countAmountsOfAidTestInvalidNumber() {
        path = Path.of("src/test/resources/population3.txt");
        exception = assertThrows(IllegalStateException.class, () -> aid.countAmountsOfAid(path));
        assertEquals("Something went wrong while counting.", exception.getMessage());
        assertEquals(NumberFormatException.class, exception.getCause().getClass());
    }

    @Test
    void countAmountsOfAidTestDivisionByZero() {
        path = Path.of("src/test/resources/population4.txt");
        exception = assertThrows(IllegalStateException.class, () -> aid.countAmountsOfAid(path));
        assertEquals("Something went wrong while counting.", exception.getMessage());
        assertEquals(ArithmeticException.class, exception.getCause().getClass());
    }
}