package algorithmssum.twodigitodds;

import java.util.ArrayList;
import java.util.List;

public class TwoDigitOdds {

    public int getSum() {
        List<Integer> twoDigitNumbers = getTwoDigitNumbers();
        int sum = 0;
        for (int twoDigitNumber : twoDigitNumbers) {
            if (twoDigitNumber % 2 != 0 && twoDigitNumber % 5 != 0) {
                sum += twoDigitNumber;
            }
        }
        return sum;
    }

    private List<Integer> getTwoDigitNumbers() {
        List<Integer> twoDigitNumbers = new ArrayList<>();
        for (int i = 10; i < 100; i++) {
            twoDigitNumbers.add(i);
        }
        return twoDigitNumbers;
    }
}