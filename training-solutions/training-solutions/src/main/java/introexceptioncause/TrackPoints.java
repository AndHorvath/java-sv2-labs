package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {

    public List<String> readTrackPoints(String path) {
        try {
            return Files.readAllLines(Paths.get(path));
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file.", exception);
        }
    }

    public List<Integer> getUpHillsAndDownHills(List<String> trackPoints) {
        List<Integer> upHillsAndDownHills = new ArrayList<>();
        for (int i = 1; i < trackPoints.size(); i++) {
            upHillsAndDownHills.add(getDifference(trackPoints.get(i - 1), trackPoints.get(i)));
        }
        return upHillsAndDownHills;
    }

    private int getDifference(String trackPointBefore, String trackPointAfter) {
        int heightBefore;
        int heightAfter;
        try {
            heightBefore = Integer.parseInt(trackPointBefore.split(";")[2]);
            heightAfter = Integer.parseInt(trackPointAfter.split(";")[2]);
        } catch (NumberFormatException exception) {
            throw new IllegalStateException("Not a number.", exception);
        }
        return heightAfter - heightBefore;
    }
}