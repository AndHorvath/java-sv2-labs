package methodpass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {

    WindowOperation windowOperation;
    List<Window> windows;

    @BeforeEach
    void setUp() {
        windowOperation = new WindowOperation();
        windows = Arrays.asList(
                new Window("living room", 100, 150),
                new Window("bathroom", 50, 100)
        );
    }

    @Test
    void riseSizeTest() {
        windowOperation.riseSize(windows, 10);

        assertEquals(160, windows.get(0).getHeight());
        assertEquals(110, windows.get(1).getHeight());
    }
}