package inheritanceconstructor.tea;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TeaTest {

    Tea tea;

    @BeforeEach
    void setUp() {
        tea = new Tea("Tea", 200);
    }

    @Test
    void getNameTest() {
        assertEquals("Tea", tea.getName());
    }

    @Test
    void getPriceTest() {
        assertEquals(200, tea.getPrice());
    }
}