package controladvanced.numbers;

import java.util.ArrayList;
import java.util.List;

public class ForbiddenSevens {

    public void createForbiddenSevensSequence(int initialValue) {
        for (int i = initialValue; ; i++) {
            if (i % 7 == 0) {
                System.out.println("X");
            } else if (Integer.toString(i).contains("7")) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }

    public List<Integer> createForbiddenSevensListForJUnit(int initialValue) {
        List<Integer> resultWithoutSevens = new ArrayList<>();

        for (int i = initialValue; ; i++) {
            if (i % 7 == 0) {
                resultWithoutSevens.add(-1);
            } else if (Integer.toString(i).contains("7")) {
                break;
            } else {
                resultWithoutSevens.add(i);
            }
        }
        return resultWithoutSevens;
    }
}