package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {

    // --- attributes ---------------------------------------------------------

    private List<FieldPoint> fieldPoints;

    // --- constructors -------------------------------------------------------

    public HikingTour() {
        this.fieldPoints = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<FieldPoint> getFieldPoints() { return fieldPoints; }

    // --- public methods -----------------------------------------------------

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {
        validateParameters(timeOfLogging);
        for (FieldPoint fieldPoint : fieldPointsToLog) {
            fieldPoint.setTimeOfLogging(timeOfLogging);
            fieldPoints.add(fieldPoint);
        }
    }

    // --- private methods ----------------------------------------------------

    private void validateParameters(LocalDateTime timeOfLogging) {
        if (timeOfLogging == null) {
            throw new IllegalArgumentException("Parameter timeOfLogging mustn't be null.");
        }
    }
}