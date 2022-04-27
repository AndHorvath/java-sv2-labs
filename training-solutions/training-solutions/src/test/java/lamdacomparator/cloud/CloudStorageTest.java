package lamdacomparator.cloud;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloudStorageTest {

    CloudStorage cloudStorageA;
    CloudStorage cloudStorageB;

    double epsilon;

    @BeforeEach
    void setUp() {
        cloudStorageA = new CloudStorage("Provider A", 5_000);
        cloudStorageB = new CloudStorage("Provider B", 7_000, 17_000.0, PayPeriod.ANNUAL);

        epsilon = Math.pow(10, -5);
    }

    @Test
    void testGetProvider() {
        assertEquals("Provider A", cloudStorageA.getProvider());
        assertEquals("Provider B", cloudStorageB.getProvider());
    }

    @Test
    void testGetSpace() {
        assertEquals(5_000, cloudStorageA.getSpace());
        assertEquals(7_000, cloudStorageB.getSpace());
    }

    @Test
    void testGetPrice() {
        assertEquals(0.0, cloudStorageA.getPrice(), epsilon);
        assertEquals(17_000.0, cloudStorageB.getPrice(), epsilon);
    }

    @Test
    void testGetPayPeriod() {
        assertNull(cloudStorageA.getPayPeriod());
        assertEquals(PayPeriod.ANNUAL, cloudStorageB.getPayPeriod());
    }

    @Test
    void testCompareTo() {
        CloudStorage other = new CloudStorage("Provider Other", 13_000, 105_000.0, PayPeriod.LIFETIME);

        assertTrue(cloudStorageA.compareTo(other) < 0);
        assertTrue(cloudStorageB.compareTo(other) > 0);
    }
}