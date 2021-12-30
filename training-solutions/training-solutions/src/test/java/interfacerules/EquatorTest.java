package interfacerules;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EquatorTest {

    Equator equator;
    double epsilon;

    @BeforeEach
    void setUp() {
        equator = new Equator();
        epsilon = Math.pow(10.0, -5.0);
    }

    @Test
    void getNameTest() {
        assertEquals("Equator", equator.getName());
    }

    @Test
    void gerLengthTest() {
        assertEquals(40_000.0, equator.gerLength(), epsilon);
    }
}