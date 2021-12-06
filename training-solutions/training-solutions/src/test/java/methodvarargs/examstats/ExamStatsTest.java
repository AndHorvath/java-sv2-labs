package methodvarargs.examstats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    ExamStats examStats;

    @BeforeEach
    void setUp() {
        examStats = new ExamStats(81);
    }

    @Test
    void getMaxPointsTest() {
        assertEquals(81, examStats.getMaxPoints());
    }

    @Test
    void getNumberOfTopGradesTest() {
        assertEquals(2, examStats.getNumberOfTopGrades(85, 68, 69, 70, 71));
    }

    @Test
    void getNumberOfTopGradesExceptionTest() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> examStats.getNumberOfTopGrades(85));
        assertEquals("No results given for statistics.", exception.getMessage());
    }

    @Test
    void hasAnyFailedTest() {
        assertFalse(examStats.hasAnyFailed(50, 68, 69, 70, 71));
    }

    @Test
    void hasAnyFailedExceptionTest() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> examStats.hasAnyFailed(50));
        assertEquals("No results given for statistics.", exception.getMessage());
    }
}