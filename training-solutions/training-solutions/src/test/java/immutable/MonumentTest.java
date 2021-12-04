package immutable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MonumentTest {

    Monument monument;
    String name;
    String address;
    String registryNumber;
    LocalDate dateOfRegistration;

    @BeforeEach
    void setUp() {
        name = "Kossuth";
        address = "Kossuth tér Budapest";
        registryNumber = "A-1";
        dateOfRegistration = LocalDate.of(2000, 1, 1);
        monument = new Monument(name, address, registryNumber, dateOfRegistration);
    }

    @Test
    void getNameTest() {
        assertEquals(name, monument.getName());
    }

    @Test
    void getAddressTest() {
        assertEquals(address, monument.getAddress());
    }

    @Test
    void getRegistryNumberTest() {
        assertEquals(registryNumber, monument.getRegistryNumber());
    }

    @Test
    void getDateOfRegistrationTest() {
        assertEquals(dateOfRegistration, monument.getDateOfRegistration());
    }

    @Test
    void createWithInvalidParametersTest() {
        String expectedEmptyMessage = "Name, address or registry number cannot be empty!";

        createWithInvalidNameTest(expectedEmptyMessage);
        createWithInvalidAddressTest(expectedEmptyMessage);
        createWithInvalidRegistryNumberTest(expectedEmptyMessage);
    }

    // --- private methods ----------------------------------------------------

    private void createWithInvalidNameTest(String expectedEmptyMessage) {
        IllegalArgumentException exception;

        exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Monument(null, address, registryNumber, dateOfRegistration));
        assertEquals(expectedEmptyMessage, exception.getMessage());

        exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Monument(" ", address, registryNumber, dateOfRegistration));
        assertEquals(expectedEmptyMessage, exception.getMessage());
    }

    private void createWithInvalidAddressTest(String expectedEmptyMessage) {
        IllegalArgumentException exception;

        exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Monument(name, null, registryNumber, dateOfRegistration));
        assertEquals(expectedEmptyMessage, exception.getMessage());

        exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Monument(name, " ", registryNumber, dateOfRegistration));
        assertEquals(expectedEmptyMessage, exception.getMessage());
    }

    private void createWithInvalidRegistryNumberTest(String expectedEmptyMessage) {
        IllegalArgumentException exception;

        exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Monument(name, address, null, dateOfRegistration));
        assertEquals(expectedEmptyMessage, exception.getMessage());

        exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Monument(name, address, " ", dateOfRegistration));
        assertEquals(expectedEmptyMessage, exception.getMessage());
    }
}