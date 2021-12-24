package inheritancemethods.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    Boss boss;

    @BeforeEach
    void setUp() {
        boss = new Boss("John Doe", "123 Central Rd. Mainville 10101", 2000d, 3);
    }

    @Test
    void getNumberOfEmployees() {
        assertEquals(3, boss.getNumberOfEmployees());
    }

    @Test
    void getSalary() {
        assertEquals(2600d, boss.getSalary());
    }
}