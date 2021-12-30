package interfacerules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IkeaFurnitureTest {

    IkeaFurniture ikeaFurniture;
    double epsilon;

    @BeforeEach
    void setUp() {
        ikeaFurniture = new IkeaFurniture("table", 70.0, 130.0);
        epsilon = Math.pow(10.0, -5.0);
    }

    @Test
    void getNameTest() {
        assertEquals("table", ikeaFurniture.getName());
    }

    @Test
    void gerLengthTest() {
        assertEquals(70.0, ikeaFurniture.gerLength(), epsilon);
    }

    @Test
    void getWidthTest() {
        assertEquals(130.0, ikeaFurniture.getWidth(), epsilon);
    }
}