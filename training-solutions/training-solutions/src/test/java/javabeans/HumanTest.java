package javabeans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human human;

    @BeforeEach
    void setUp() {
        human = new Human("Jeffrey Doe", 90d, 130);
    }

    @Test
    void getNameTest() {
        assertEquals("Jeffrey Doe", human.getName());
    }

    @Test
    void setNameTest() {
        human.setName("Jeff Doe");
        assertEquals("Jeff Doe", human.getName());
    }

    @Test
    void getWeightTest() {
        assertEquals(90d, human.getWeight());
    }

    @Test
    void setWeightTest() {
        human.setWeight(95d);
        assertEquals(95d, human.getWeight());
    }

    @Test
    void getIqTest() {
        assertEquals(130, human.getIq());
    }

    @Test
    void setIqTest() {
        human.setIq(135);
        assertEquals(135, human.getIq());
    }
}