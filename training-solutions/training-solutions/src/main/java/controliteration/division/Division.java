package controliteration.division;

import java.util.ArrayList;
import java.util.List;

public class Division {

    public List<Integer> getNumbersDivisibleByAndLessThanWithFor(int divisor, int upperLimit) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 1; i < upperLimit; i++) {
            if (i % divisor == 0) {
                resultList.add(i);
            }
        }
        return resultList;
    }

    public List<Integer> getNumbersDivisibleByAndLessThanWithWhile(int divisor, int upperLimit) {
        List<Integer> resultList = new ArrayList<>();
        int i = 1;

        while (i < upperLimit) {
            if (i % divisor == 0) {
                resultList.add(i);
            }
            i++;
        }
        return resultList;
    }
}