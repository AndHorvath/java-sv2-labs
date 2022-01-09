package polymorphism.architect;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConstructionPlanTest {

    ConstructionPlan constructionPlan;

    @BeforeEach
    void setUp() {
        constructionPlan = new ConstructionPlan(10, "Building", "John Doe", "123 Main Street, 10101 London", 5);
    }

    @Test
    void getSheetsOfConstructionDrawingsTest() {
        assertEquals(5, constructionPlan.getSheetsOfConstructionDrawings());
    }
}