package methodstructure.pendrives;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PenDrivesTest {

    PenDrives penDrives;
    List<PenDrive> penDriveList;

    @BeforeEach
    void setUp() {
        penDrives = new PenDrives();
        penDriveList = new ArrayList<>(Arrays.asList(
                new PenDrive("PD-A", 16, 10_000),
                new PenDrive("PD-B", 32, 15_000),
                new PenDrive("PD-C", 32, 25_000)
        ));
    }

    @Test
    void getBestTest() {
        assertEquals(penDriveList.get(1), penDrives.getBest(penDriveList));
    }

    @Test
    void getCheapestTest() {
        assertEquals(penDriveList.get(0), penDrives.getCheapest(penDriveList));
    }

    @Test
    void risePriceWhereCapacityTest() {
        penDrives.risePriceWhereCapacity(penDriveList, 10, 32);
        assertEquals(10_000, penDriveList.get(0).getPrice());
        assertEquals(16_500, penDriveList.get(1).getPrice());
        assertEquals(27_500, penDriveList.get(2).getPrice());
    }
}