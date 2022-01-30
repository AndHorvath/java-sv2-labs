package searching;

import java.util.Arrays;

public class Mountain {

    // --- attributes ---------------------------------------------------------

    private int[] peaks;

    // --- constructors -------------------------------------------------------

    public Mountain(int[] peaks) {
        this.peaks = peaks;
        Arrays.sort(this.peaks);
    }

    // --- getters and setters ------------------------------------------------

    public int[] getPeaks() { return peaks; }

    // --- public methods -----------------------------------------------------

    public boolean searchPeak(Peak peak) {
        return Arrays.binarySearch(peaks, peak.getHeight()) >= 0;
    }
}