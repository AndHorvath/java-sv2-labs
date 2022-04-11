package activitytracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TrackPointTest {

    TrackPoint trackPoint;
    double epsilon;

    @BeforeEach
    void setUp() {
        trackPoint = new TrackPoint(LocalDate.of(2020, 10, 20), 47.5, 19.05);
        epsilon = Math.pow(10, -5);
    }

    @Test
    void getIdTest() {
        assertNull(trackPoint.getId());
    }

    @Test
    void getTimeTest() {
        assertEquals(LocalDate.of(2020, 10, 20), trackPoint.getTime());
    }

    @Test
    void getLatitudeTest() {
        assertEquals(47.5, trackPoint.getLatitude(), epsilon);
    }

    @Test
    void getLongitudeTest() {
        assertEquals(19.05, trackPoint.getLongitude(), epsilon);
    }

    @Test
    void setIdTest() {
        trackPoint.setId(1L);
        assertEquals(1L, trackPoint.getId());
    }
}