package clone.timesheet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class TimeSheetItemTest {

    TimeSheetItem timeSheetItem;
    TimeSheetItem other;

    @BeforeEach
    void setUp() {
        timeSheetItem = new TimeSheetItem(
            "Employee", "Project",
            LocalDateTime.of(2020, 10, 20, 10, 0), LocalDateTime.of(2020, 10, 20, 20, 0)
        );
    }

    @Test
    void copyConstructorTest() {
        other = new TimeSheetItem(timeSheetItem);

        assertEquals(timeSheetItem.getEmployee(), other.getEmployee());
        assertEquals(timeSheetItem.getProject(), other.getProject());
        assertEquals(timeSheetItem.getFrom(), other.getFrom());
        assertEquals(timeSheetItem.getTo(), other.getTo());

        assertNotSame(timeSheetItem, other);
    }

    @Test
    void getEmployeeTest() {
        assertEquals("Employee", timeSheetItem.getEmployee());
    }

    @Test
    void getProjectTest() {
        assertEquals("Project", timeSheetItem.getProject());
    }

    @Test
    void getFromTest() {
        assertEquals(LocalDateTime.of(2020, 10, 20, 10, 0), timeSheetItem.getFrom());
    }

    @Test
    void getToTest() {
        assertEquals(LocalDateTime.of(2020, 10, 20, 20, 0), timeSheetItem.getTo());
    }

    @Test
    void copyWithDifferentEmployeeTest() {
        other = timeSheetItem.copyWithDifferentEmployee(timeSheetItem, "Other Employee");

        assertEquals("Other Employee", other.getEmployee());
        assertEquals(timeSheetItem.getProject(), other.getProject());
        assertEquals(timeSheetItem.getFrom(), other.getFrom());
        assertEquals(timeSheetItem.getTo(), other.getTo());
    }
}