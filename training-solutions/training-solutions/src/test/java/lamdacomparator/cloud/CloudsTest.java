package lamdacomparator.cloud;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CloudsTest {

    Clouds clouds;

    CloudStorage cloudStorageA;
    CloudStorage cloudStorageB;
    CloudStorage cloudStorageC;
    CloudStorage cloudStorageD;
    CloudStorage cloudStorageE;
    CloudStorage cloudStorageF;

    @BeforeEach
    void setUp() {
        clouds = new Clouds();

        cloudStorageA = new CloudStorage("Provider BA", 3_000);
        cloudStorageB = new CloudStorage("Provider aB", 5_000);
        cloudStorageC = new CloudStorage("Provider CC", 7_000, 17_000.0, PayPeriod.ANNUAL);
        cloudStorageD = new CloudStorage("Provider DD", 13_000, 105_000.0, PayPeriod.LIFETIME);
        cloudStorageE = new CloudStorage("Provider EE", 11_000, 2_000.0, PayPeriod.MONTHLY);
        cloudStorageF = new CloudStorage("Provider FF", 12_000, 23_000.0, PayPeriod.ANNUAL);

        fillClouds(
            clouds,
            List.of(cloudStorageA ,cloudStorageB ,cloudStorageC, cloudStorageD, cloudStorageE, cloudStorageF)
        );
    }

    @Test
    void testGetCloudStorages() {
        assertEquals(
            List.of(cloudStorageA ,cloudStorageB ,cloudStorageC, cloudStorageD, cloudStorageE, cloudStorageF),
            clouds.getCloudStorages()
        );
    }

    @Test
    void testAddCloudStorage() {
        CloudStorage other = new CloudStorage("Provider Other", 1_000);
        clouds.addCloudStorage(other);

        assertEquals(
            List.of(cloudStorageA ,cloudStorageB ,cloudStorageC, cloudStorageD, cloudStorageE, cloudStorageF, other),
            clouds.getCloudStorages()
        );
    }

    @Test
    void testAlphabeticallyFirst() {
        assertEquals(cloudStorageB, clouds.alphabeticallyFirst());
    }

    @Test
    void testBestPriceForShortestPeriod() {
        assertEquals(cloudStorageA, clouds.bestPriceForShortestPeriod());

        Clouds otherClouds = new Clouds();
        CloudStorage otherStorage = new CloudStorage("Provider Other", 5_000, 1_000.0, PayPeriod.MONTHLY);
        fillClouds(otherClouds, List.of(cloudStorageC, cloudStorageD, cloudStorageE, cloudStorageF, otherStorage));

        assertEquals(otherStorage, otherClouds.bestPriceForShortestPeriod());
    }

    @Test
    void testWorstOffers() {
        assertEquals(List.of(cloudStorageC, cloudStorageE, cloudStorageF), clouds.worstOffers());
    }

    // --- private methods ----------------------------------------------------

    private void fillClouds(Clouds clouds, List<CloudStorage> cloudStorages) {
        for (CloudStorage cloudStorage : cloudStorages) {
            clouds.addCloudStorage(cloudStorage);
        }
    }
}