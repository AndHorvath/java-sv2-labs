package algorithmsdecision.towns;

import java.util.List;

public class Town {

    public boolean containsFewerInhabitants(List<Integer> inhabitantsList, int upperBound) {
        for (int inhabitants : inhabitantsList) {
            if (inhabitants < upperBound) {
                return true;
            }
        }
        return false;
    }
}