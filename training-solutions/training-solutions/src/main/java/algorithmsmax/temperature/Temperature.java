package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

    public int getMin(List<Integer> temperatures) {
        int min = Integer.MAX_VALUE;
        for (int temperature : temperatures) {
            if (temperature < min) {
                min = temperature;
            }
        }
        return min;
    }
}