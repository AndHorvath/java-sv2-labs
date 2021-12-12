package inheritanceconstructor.classroom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    ClassRoom classRoom;

    @BeforeEach
    void setUp() {
        classRoom = new ClassRoom("1st floor", 20, Facility.COMPUTERS);
    }

    @Test
    void getFacilityTest() {
        assertEquals(Facility.COMPUTERS, classRoom.getFacility());
    }

    @Test
    void isSuitableTest() {
        Course courseA = new Course(15, Facility.COMPUTERS);
        Course courseB = new Course(25, Facility.COMPUTERS);
        Course courseC = new Course(15, Facility.PROJECTOR);

        assertTrue(classRoom.isSuitable(courseA));
        assertFalse(classRoom.isSuitable(courseB));
        assertFalse(classRoom.isSuitable(courseC));
    }
}