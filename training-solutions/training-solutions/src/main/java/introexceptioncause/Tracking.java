package introexceptioncause;

import java.util.ArrayList;
import java.util.List;

public class Tracking {

    public static void main(String[] args) {
        List<String> trackPointsString;
        List<Integer> differences = new ArrayList<>();
        String path = "src/main/resources/tracking.csv";
        TrackPoints trackPoints = new TrackPoints();
        try {
            trackPointsString = trackPoints.readTrackPoints(path);
            differences = trackPoints.getUpHillsAndDownHills(trackPointsString);
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        }
        for (int difference : differences) {
            System.out.println(difference);
        }
    }
}