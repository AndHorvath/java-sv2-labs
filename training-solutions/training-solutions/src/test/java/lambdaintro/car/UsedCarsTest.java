package lambdaintro.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsedCarsTest {

    UsedCars usedCars;

    Car carA;
    Car carB;
    Car carC;
    Car carD;

    List<Car> expectedCars;

    @BeforeEach
    void setUp() {
        carA = new Car("Brand A", "Type AA", 3000, 4.1);
        carB = new Car("Brand B", "Type BA", 2000, 4.4);
        carC = new Car("Brand C", "Type CA", 4000, 4.2);
        carD = new Car("Brand D", "Type DA", 1000, 4.3);

        usedCars = new UsedCars();
        usedCars.addCar(carA);
        usedCars.addCar(carB);
        usedCars.addCar(carC);
        usedCars.addCar(carD);
    }

    @Test
    void testGetCars() {
        expectedCars = List.of(carA, carB, carC, carD);
        assertEquals(expectedCars, usedCars.getCars());
    }

    @Test
    void testAddCar() {
        Car carE = new Car("Brand E", "Type EA", 5000, 4.5);
        usedCars.addCar(carE);

        expectedCars = List.of(carA, carB, carC, carD, carE);
        assertEquals(expectedCars, usedCars.getCars());
    }

    @Test
    void testListCarsByPrice() {
        expectedCars = List.of(carD, carB, carA, carC);
        assertEquals(expectedCars, usedCars.listCarsByPrice());
    }

    @Test
    void testListCarsByLengthDesc() {
        expectedCars = List.of(carB, carD, carC, carA);
        assertEquals(expectedCars, usedCars.listCarsByLengthDesc());
    }

    @Test
    void testListCarsOneBrandByType() {
        Car carE = new Car("Brand B", "Type BC", 1000, 4.1);
        Car carF = new Car("Brand B", "Type BB", 1000, 4.1);
        usedCars.addCar(carE);
        usedCars.addCar(carF);

        expectedCars = List.of(carB, carF, carE);
        assertEquals(expectedCars, usedCars.listCarsOneBrandByType("Brand B"));
    }
}