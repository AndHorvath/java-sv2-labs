package methodpass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WindowTest {

    Window window;

    @BeforeEach
    void setUp() {
        window = new Window("living room", 100, 150);
    }

    @Test
    void getRoomNameTest() {
        assertEquals("living room", window.getRoomName());
    }
    @Test
    void setRoomNameTest() {
        window.setRoomName("bathroom");
        assertEquals("bathroom", window.getRoomName());
    }

    @Test
    void getWidthTest() {
        assertEquals(100, window.getWidth());
    }
    @Test
    void setWidthTest() {
        window.setWidth(120);
        assertEquals(120, window.getWidth());
    }

    @Test
    void getHeightTest() {
        assertEquals(150, window.getHeight());
    }
    @Test
    void setHeightTest() {
        window.setHeight(160);
        assertEquals(160, window.getHeight());
    }
}