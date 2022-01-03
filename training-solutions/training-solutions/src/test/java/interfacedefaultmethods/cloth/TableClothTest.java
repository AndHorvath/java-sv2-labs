package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    TableCloth tableCloth;
    double epsilon;

    @BeforeEach
    void setUp() {
        tableCloth = new TableCloth(1);
        epsilon = Math.pow(10, -5);
    }

    @Test
    void getSideTest() {
        assertEquals(1, tableCloth.getSide(), epsilon);
    }

    @Test
    void getNumberOfSidesTest() {
        assertEquals(4, tableCloth.getNumberOfSides());
    }

    @Test
    void getLengthOfDiagonalTest() {
        assertEquals(Math.sqrt(2), tableCloth.getLengthOfDiagonal(), epsilon);
    }

    @Test
    void getPerimeterTest() {
        assertEquals(4, tableCloth.getPerimeter(), epsilon);
    }

    @Test
    void getArea() {
        assertEquals(1, tableCloth.getArea(), epsilon);
    }
}