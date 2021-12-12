package inheritanceconstructor.classroom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    Room room;

    @BeforeEach
    void setUp() {
        room = new Room("1st floor", 20);
    }

    @Test
    void getLocationTest() {
        assertEquals("1st floor", room.getLocation());
    }

    @Test
    void getCapacityTest() {
        assertEquals(20, room.getCapacity());
    }
}