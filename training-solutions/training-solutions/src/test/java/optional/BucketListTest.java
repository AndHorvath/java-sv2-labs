package optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BucketListTest {

    BucketList bucketList;
    Destination destinationA;
    Destination destinationB;
    Destination destinationC;
    Destination destinationD;

    @BeforeEach
    void setUp() {
        destinationA = new Destination("Destination A", "Mountain destination", 400);
        destinationB = new Destination("Destination B", "Mountain destination", 300);
        destinationC = new Destination("Destination C", "See destination", 200);
        destinationD = new Destination("Destination D", "See destination", 100);

        bucketList = new BucketList(new ArrayList<>(Arrays.asList(
            destinationA, destinationB, destinationC, destinationD
        )));
    }

    @Test
    void getDestinationsTest() {
        assertEquals(
            new ArrayList<>(Arrays.asList(destinationA, destinationB, destinationC, destinationD)),
            bucketList.getDestinations()
        );
    }

    @Test
    void getDestinationWithKeywordTest() {
        assertEquals(
            destinationA,
            bucketList.getDestinationWithKeyword("Mountain").isPresent() ?
            bucketList.getDestinationWithKeyword("Mountain").get() : Optional.empty());
        assertEquals(Optional.empty(), bucketList.getDestinationWithKeyword("City"));
    }

    @Test
    void getDestinationNearerThanGivenTest() {
        assertEquals(
            destinationD,
            bucketList.getDestinationNearerThanGiven(200).isPresent() ?
            bucketList.getDestinationNearerThanGiven(200).get() : Optional.empty());
        assertEquals(Optional.empty(), bucketList.getDestinationNearerThanGiven(100));
    }
}