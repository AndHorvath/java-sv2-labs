package algorithmsmax.trainer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    Trainer trainer;

    @BeforeEach
    void setUp() {
        trainer = new Trainer("John Doe", 40);
    }

    @Test
    void getName() {
        String expectedName = "John Doe";
        assertEquals(expectedName, trainer.getName());
    }

    @Test
    void getAge() {
        int expectedAge = 40;
        assertEquals(expectedAge, trainer.getAge());
    }
}