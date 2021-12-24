package inheritancemethods.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BigBossTest {

    BigBoss bigBoss;

    @BeforeEach
    void setUp() {
        bigBoss = new BigBoss("John Doe", "123 Central Rd. Mainville", 2000d, 5, 400d);
    }

    @Test
    void getBonusTest() {
        assertEquals(400d, bigBoss.getBonus());
    }

    @Test
    void getSalaryTest() {
        assertEquals(3400d, bigBoss.getSalary());
    }
}