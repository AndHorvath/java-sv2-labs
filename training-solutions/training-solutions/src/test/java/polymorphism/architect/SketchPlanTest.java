package polymorphism.architect;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SketchPlanTest {

    SketchPlan sketchPlan;

    @BeforeEach
    void setUp() {
        sketchPlan = new SketchPlan(10, "Building");
    }

    @Test
    void getPagesOfDocumentationTest() {
        assertEquals(10, sketchPlan.getPagesOfDocumentation());
    }

    @Test
    void getTitleTest() {
        assertEquals("Building", sketchPlan.getTitle());
    }
}