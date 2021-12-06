package methodvarargs.gps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {

    HikingTour hikingTour;

    @BeforeEach
    void setUp() {
        hikingTour = new HikingTour();
    }

    @Test
    void getFieldPointsTest() {
        assertEquals(0, hikingTour.getFieldPoints().size());
    }

    @Test
    void logFieldPointsTest() {
        FieldPoint fieldPointA = new FieldPoint(
                LocalDateTime.of(2020, Month.JUNE, 1, 12, 0),
                47.87d, 20.01d);
        FieldPoint fieldPointB = new FieldPoint(
                LocalDateTime.of(2020, Month.JUNE, 3, 11, 0),
                48.09d, 20.48d);
        LocalDateTime timeOfLogging =
                LocalDateTime.of(2020, Month.JUNE, 4, 10, 30);
        hikingTour.logFieldPoints(timeOfLogging, fieldPointA, fieldPointB);

        assertEquals(fieldPointA, hikingTour.getFieldPoints().get(0));
        assertEquals(fieldPointB, hikingTour.getFieldPoints().get(1));
        assertEquals(timeOfLogging, hikingTour.getFieldPoints().get(0).getTimeOfLogging());
        assertEquals(timeOfLogging, hikingTour.getFieldPoints().get(1).getTimeOfLogging());

    }

    @Test
    void logFieldPointsExceptionTest() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, ()-> hikingTour.logFieldPoints(null));
        assertEquals("Parameter timeOfLogging mustn't be null.", exception.getMessage());
    }
}