package exceptions.measurement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    Measurement measurement;
    Path path;
    Path wrongPath;
    IllegalStateException exception;

    @BeforeEach
    void setUp() {
        measurement = new Measurement();
        path = Path.of("src/test/resources/measurementdata.csv");
    }

    @Test
    void readFromFileTest() {
        assertEquals(11, measurement.readFromFile(path).size());
        assertEquals("1,12.4,John Doe", measurement.readFromFile(path).get(0));
        assertEquals("a1,12a.4,John Doe", measurement.readFromFile(path).get(7));
        assertEquals("8,12.4", measurement.readFromFile(path).get(9));
    }

    @Test
    void readFromFileExceptionTest() {
        wrongPath = Path.of("src/test/resources/measurement_data.csv");
        exception = assertThrows(
            IllegalStateException.class, () -> measurement.readFromFile(wrongPath));
        assertEquals("Cannot read file.", exception.getMessage());
    }

    @Test
    void validateTest() {
        assertEquals(8, measurement.validate(measurement.readFromFile(path)).size());
        assertEquals("2,12.4,John Doe,a", measurement.validate(measurement.readFromFile(path)).get(0));
        assertEquals("a,12.4,John Doe", measurement.validate(measurement.readFromFile(path)).get(1));
        assertEquals("a1,12a.4,John Doe", measurement.validate(measurement.readFromFile(path)).get(4));
        assertEquals("9,12.4,", measurement.validate(measurement.readFromFile(path)).get(7));
    }
}