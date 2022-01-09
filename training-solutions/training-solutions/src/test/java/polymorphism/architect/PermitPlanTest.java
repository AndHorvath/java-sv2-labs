package polymorphism.architect;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermitPlanTest {

    PermitPlan permitPlan;

    @BeforeEach
    void setUp() {
        permitPlan = new PermitPlan(10, "Building", "John Doe", "123 Main Street, 10101 London");
    }

    @Test
    void getNameOfClientTest() {
        assertEquals("John Doe", permitPlan.getNameOfClient());
    }

    @Test
    void getAddressOfBuildingTest() {
        assertEquals("123 Main Street, 10101 London", permitPlan.getAddressOfBuilding());
    }

    @Test
    void getHeaderTest() {
        assertEquals("Building\nJohn Doe\n123 Main Street, 10101 London", permitPlan.getHeader());
    }
}