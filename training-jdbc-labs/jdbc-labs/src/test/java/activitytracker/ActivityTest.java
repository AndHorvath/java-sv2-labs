package activitytracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityTest {

    Activity activity;
    TrackPoint trackPointA;
    TrackPoint trackPointB;

    @BeforeEach
    void setUp() {
        activity = new Activity(
            LocalDateTime.of(2020, 10, 10, 20, 20), "Light training.", Type.BIKING
        );
        trackPointA = new TrackPoint(LocalDate.of(2020, 10, 20), 47.5, 19.05);
        trackPointB = new TrackPoint(LocalDate.of(2020, 10, 10), 47.5, 21.58);
    }

    @Test
    void getIdTest() {
        assertNull(activity.getId());
    }

    @Test
    void getStartTimeTest() {
        assertEquals(LocalDateTime.of(2020, 10, 10, 20, 20), activity.getStartTime());
    }

    @Test
    void getDescriptionTest() {
        assertEquals("Light training.", activity.getDescription());
    }

    @Test
    void getTypeTest() {
        assertEquals(Type.BIKING, activity.getType());
    }

    @Test
    void getTrackPointsTest() {
        assertEquals(new ArrayList<>(), activity.getTrackPoints());
    }

    @Test
    void setIdTest() {
        activity.setId(1L);
        assertEquals(1L, activity.getId());
    }

    @Test
    void addTrackPointTest() {
        activity.addTrackPoint(trackPointA);
        assertEquals(List.of(trackPointA), activity.getTrackPoints());
    }

    @Test
    void addTrackPointsTest() {
        activity.addTrackPoints(List.of(trackPointA, trackPointB));
        assertEquals(List.of(trackPointA, trackPointB), activity.getTrackPoints());
    }

    @Test
    void toStringTest() {
        activity.setId(1L);
        assertEquals(
            "Activity{id=1, startTime=2020-10-10T20:20, description='Light training.', type=BIKING}",
            activity.toString()
        );
    }
}