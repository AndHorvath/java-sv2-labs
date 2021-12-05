package methodstructure.bmi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {

    BodyMass bodyMass;
    BodyMass other;

    @BeforeEach
    void setUp() {
        bodyMass = new BodyMass(90d, 1.8d);
    }

    @Test
    void getWeightTest() {
        assertEquals(90d, bodyMass.getWeight());
    }

    @Test
    void getHeightTest() {
        assertEquals(1.8d, bodyMass.getHeight());
    }

    @Test
    void getBodyMassIndexTest() {
        double expectedIndex = 90d / Math.pow(1.8d, 2d);
        assertEquals(expectedIndex, bodyMass.getBodyMassIndex());
    }

    @Test
    void getBodyTest() {
        assertEquals(BmiCategory.OVERWEIGHT, bodyMass.getBody());
    }

    @Test
    void isThinnerThanTest() {
        other = new BodyMass(95d, 1.8d);
        assertTrue(bodyMass.isThinnerThan(other));

        other = new BodyMass(85d, 1.8d);
        assertFalse(bodyMass.isThinnerThan(other));
    }
}