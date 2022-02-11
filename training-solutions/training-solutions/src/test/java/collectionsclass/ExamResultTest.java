package collectionsclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExamResultTest {

    ExamResult examResult;

    @BeforeEach
    void setUp() {
        examResult = new ExamResult("Examinee", 100);
    }

    @Test
    void getNameTest() {
        assertEquals("Examinee", examResult.getName());
    }

    @Test
    void getResultTest() {
        assertEquals(100, examResult.getResult());
    }
}