package inheritanceconstructor.classroom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course;

    @BeforeEach
    void setUp() {
        course = new Course(15, Facility.COMPUTERS);
    }

    @Test
    void getParticipantsTest() {
        assertEquals(15, course.getParticipants());
    }

    @Test
    void getFacilityNeededTest() {
        assertEquals(Facility.COMPUTERS, course.getFacilityNeeded());
    }
}