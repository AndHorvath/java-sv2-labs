package sorting.cardealership;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarConstructionComparatorTest {

    Car carA;
    Car carB;
    CarConstructionComparator carConstructionComparator;

    @BeforeEach
    void setUp() {
        carA = new Car("Car A", 2000, 1010);
        carB = new Car("Car B", 2010, 1000);
        carConstructionComparator = new CarConstructionComparator();
    }

    @Test
    void compareTest() {
        assertTrue(carConstructionComparator.compare(carA, carB) < 0);
    }
}