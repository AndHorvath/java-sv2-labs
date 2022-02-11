package sorting.cardealership;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class CarDealerTest {

    CarDealer carDealer;
    Car carA;
    Car carB;
    Car carC;

    @BeforeEach
    void setUp() {
        carA = new Car("Car A", 2010, 1030);
        carB = new Car("Car B", 2020, 1020);
        carC = new Car("Car C", 2030, 1010);

        carDealer = new CarDealer(new ArrayList<>(Arrays.asList(
            carB, carC, carA
        )));
    }

    @Test
    void getCarsTest() {
        assertEquals(
            new ArrayList<>(Arrays.asList(carB, carC, carA)),
            carDealer.getCars()
        );
    }

    @Test
    void getCarsInConstructionOrderTest() {
        assertEquals(
            new ArrayList<>(Arrays.asList(carA, carB, carC)),
            carDealer.getCarsInConstructionOrder()
        );
        assertEquals(
            new ArrayList<>(Arrays.asList(carB, carC, carA)),
            carDealer.getCars()
        );
    }

    @Test
    void getCarsInPriceOrderTest() {
        assertEquals(
            new ArrayList<>(Arrays.asList(carC, carB, carA)),
            carDealer.getCarsInPriceOrder()
        );
        assertEquals(
            new ArrayList<>(Arrays.asList(carB, carC, carA)),
            carDealer.getCars()
        );
    }
}