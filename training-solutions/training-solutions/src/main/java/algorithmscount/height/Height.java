package algorithmscount.height;

import java.util.List;

public class Height {

    public int countChildrenWithHeightGreaterThan(List<Integer> heights, int lowerBound) {
        int counter = 0;
        for (int height : heights) {
            if (height >= lowerBound) {
                counter++;
            }
        }
        return counter;
    }
}