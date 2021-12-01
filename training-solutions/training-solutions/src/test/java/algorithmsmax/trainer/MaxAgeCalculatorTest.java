package algorithmsmax.trainer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    MaxAgeCalculator maxAgeCalculator;
    List<Trainer> trainers;

    @BeforeEach
    void setUp() {
        maxAgeCalculator = new MaxAgeCalculator();
        trainers = Arrays.asList(
                new Trainer("John Doe", 40),
                new Trainer("Jack Doe", 41),
                new Trainer("Jill Doe", 43),
                new Trainer("Jane Doe", 40),
                new Trainer("Joey Doe", 42),
                new Trainer("Jimi Doe", 43),
                new Trainer("Jean Doe", 43)
        );
    }

    @Test
    void getTrainerWithMaxAge() {
        Trainer expectedResult = trainers.get(6);
        assertEquals(expectedResult, maxAgeCalculator.getTrainerWithMaxAge(trainers));
    }

    @Test
    void getTrainerWithMaxAgeAll() {
        List<Trainer> expectedResult = Arrays.asList(
                trainers.get(2), trainers.get(5), trainers.get(6)
        );
        assertEquals(expectedResult, maxAgeCalculator.getTrainerWithMaxAgeAll(trainers));
    }
}