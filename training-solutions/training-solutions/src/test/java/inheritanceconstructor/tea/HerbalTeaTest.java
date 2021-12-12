package inheritanceconstructor.tea;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HerbalTeaTest {

    HerbalTea herbalTea;

    @BeforeEach
    void setUp() {
        herbalTea = new HerbalTea("Herbal tea", 400);
    }

    @Test
    void getNameTest() {
        assertEquals("Herbal tea", herbalTea.getName());
    }

    @Test
    void getPriceTest() {
        assertEquals(400, herbalTea.getPrice());
    }
}