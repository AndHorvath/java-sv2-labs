package sorting.cardealership;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarPriceComparatorTest {

    Car carA;
    Car carB;
    CarPriceComparator carPriceComparator;

    @BeforeEach
    void setUp() {
        carA = new Car("Car A", 2000, 1010);
        carB = new Car("Car B", 2010, 1000);
        carPriceComparator = new CarPriceComparator();
    }

    @Test
    void compareTest() {
        assertTrue(carPriceComparator.compare(carA, carB) > 0);
    }
}