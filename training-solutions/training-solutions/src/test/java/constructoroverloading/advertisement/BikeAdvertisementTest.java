package constructoroverloading.advertisement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BikeAdvertisementTest {

    BikeAdvertisement bikeAdvertisementA;
    BikeAdvertisement bikeAdvertisementB;
    BikeAdvertisement bikeAdvertisementC;
    BikeAdvertisement bikeAdvertisementD;

    String description;
    String brand;
    String serialNumber;
    List<String> extras;
    int price;

    @BeforeEach
    void setUp() {
        description = "Good bike";
        brand = "Trek";
        serialNumber = "T-111";
        extras = new ArrayList<>(Arrays.asList("computer", "helmet"));
        price = 1000;

        bikeAdvertisementA = new BikeAdvertisement(description, price);
        bikeAdvertisementB = new BikeAdvertisement(description, price, brand);
        bikeAdvertisementC = new BikeAdvertisement(description, price, brand, extras);
        bikeAdvertisementD = new BikeAdvertisement(description, price, brand, extras, serialNumber);
    }

    @Test
    void getDescriptionTest() {
        assertEquals(description, bikeAdvertisementA.getDescription());
        assertEquals(description, bikeAdvertisementB.getDescription());
        assertEquals(description, bikeAdvertisementC.getDescription());
        assertEquals(description, bikeAdvertisementD.getDescription());
    }

    @Test
    void getPriceTest() {
        assertEquals(price, bikeAdvertisementA.getPrice());
        assertEquals(price, bikeAdvertisementB.getPrice());
        assertEquals(price, bikeAdvertisementC.getPrice());
        assertEquals(price, bikeAdvertisementD.getPrice());
    }

    @Test
    void getBrandTest() {
        assertNull(bikeAdvertisementA.getBrand());

        assertEquals(brand, bikeAdvertisementB.getBrand());
        assertEquals(brand, bikeAdvertisementC.getBrand());
        assertEquals(brand, bikeAdvertisementD.getBrand());
    }

    @Test
    void getExtrasTest() {
        assertNull(bikeAdvertisementA.getExtras());
        assertNull(bikeAdvertisementB.getExtras());

        assertEquals(extras, bikeAdvertisementC.getExtras());
        assertEquals(extras, bikeAdvertisementD.getExtras());
    }

    @Test
    void getSerialNumberTest() {
        assertNull(bikeAdvertisementA.getSerialNumber());
        assertNull(bikeAdvertisementB.getSerialNumber());
        assertNull(bikeAdvertisementC.getSerialNumber());

        assertEquals(serialNumber, bikeAdvertisementD.getSerialNumber());
    }
}