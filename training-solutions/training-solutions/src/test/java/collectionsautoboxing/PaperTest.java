package collectionsautoboxing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PaperTest {

    Paper paper;

    @BeforeEach
    void setUp() {
        paper = new Paper();
    }

    @Test
    void getClassesAndWeightsTest() {
        assertEquals(new HashMap<>(), paper.getClassesAndWeights());
    }

    @Test
    void putFurtherPaperTest() {
        paper.putFurtherPaper("1.a", 100);
        paper.putFurtherPaper("1.a", 135);
        assertEquals(new HashMap<>(Map.ofEntries(Map.entry("1.a", 235))), paper.getClassesAndWeights());
    }

    @Test
    void getWinnerClassTest() {
        updateClassesAndWeights();
        assertEquals("5.b", paper.getWinnerClass());
    }

    @Test
    void getTotalWeightTest() {
        updateClassesAndWeights();
        assertEquals(1054, paper.getTotalWeight());
    }

    // --- private methods ----------------------------------------------------

    private void updateClassesAndWeights() {
        paper.putFurtherPaper("1.a", 100);
        paper.putFurtherPaper("5.b", 300);
        paper.putFurtherPaper("8.a", 200);
        paper.putFurtherPaper("1.a", 135);
        paper.putFurtherPaper("5.b", 121);
        paper.putFurtherPaper("8.a", 198);
    }
}