package collectionsclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    Exam exam;
    ExamResult examResultA;
    ExamResult examResultB;
    ExamResult examResultC;
    ExamResult examResultD;
    ExamResult examResultE;
    ExamResult examResultF;
    ExamResult examResultG;
    ExamResult examResultH;
    ExamResult examResultI;

    @BeforeEach
    void setUp() {
        examResultA = new ExamResult("Examinee A", 44);
        examResultB = new ExamResult("Examinee B", 22);
        examResultC = new ExamResult("Examinee C", 77);
        examResultD = new ExamResult("Examinee D", 66);
        examResultE = new ExamResult("Examinee E", 88);
        examResultF = new ExamResult("Examinee F", 11);
        examResultG = new ExamResult("Examinee G", 55);
        examResultH = new ExamResult("Examinee H", 99);
        examResultI = new ExamResult("Examinee I", 33);

        exam = new Exam(new ArrayList<>(Arrays.asList(
            examResultA, examResultB, examResultC,
            examResultD, examResultE, examResultF,
            examResultG, examResultH, examResultI
        )));
    }

    @Test
    void getExamResultsTest() {
        assertEquals(
            new ArrayList<>(Arrays.asList(
                examResultA, examResultB, examResultC,
                examResultD, examResultE, examResultF,
                examResultG, examResultH, examResultI
            )),
            exam.getExamResults());
    }

    @Test
    void getNamesOfSucceededPeopleTest() {
        assertEquals(
            new ArrayList<>(Arrays.asList("Examinee H", "Examinee E", "Examinee C")),
            exam.getNamesOfSucceededPeople(3));

        assertEquals(
            new ArrayList<>(Arrays.asList(
                examResultA, examResultB, examResultC,
                examResultD, examResultE, examResultF,
                examResultG, examResultH, examResultI
            )),
            exam.getExamResults());
    }
}