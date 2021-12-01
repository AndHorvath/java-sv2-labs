package algorithmsmax.hill;

import java.util.List;

public class Hill {

    public int getMax(List<Integer> hills) {
        int max = Integer.MIN_VALUE;
        for (int hill : hills) {
            if (hill > max) {
                max = hill;
            }
        }
        return max;
    }
}