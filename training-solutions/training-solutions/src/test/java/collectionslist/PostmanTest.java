package collectionslist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {

    Postman postman;

    @BeforeEach
    void setUp() {
        postman = new Postman();
    }

    @Test
    void getAddressesTest() {
        assertEquals(0, postman.getAddresses().size());
    }

    @Test
    void addAddressTest() {
        postman.addAddress("Address A");
        postman.addAddress("Address B");
        postman.addAddress("Address A");
        assertEquals(List.of("Address A", "Address B", "Address A"), postman.getAddresses());
    }

    @Test
    void removeAddressTest() {
        postman.addAddress("Address A");
        postman.addAddress("Address B");
        postman.addAddress("Address A");

        postman.removeAddress("Address A");
        assertEquals(List.of("Address B", "Address A"), postman.getAddresses());
    }
}