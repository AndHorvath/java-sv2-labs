package algorithmsmax.temperature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    Temperature temperature;
    List<Integer> temperatureList;

    @BeforeEach
    void setUp() {
        temperature = new Temperature();
        temperatureList = Arrays.asList(
                4, 5, 4, 6, 8, 7, 7, 8, 8, 7, 9, 9,
                8, 9, 7, 7, 6, 5, 6, 3, 4, 2, 3, 3
        );
    }

    @Test
    void getMinTest() {
        int expectedResult = 2;
        assertEquals(expectedResult, temperature.getMin(temperatureList));
    }
}