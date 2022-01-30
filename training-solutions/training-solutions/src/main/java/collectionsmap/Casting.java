package collectionsmap;

import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        int nextNumber = Integer.MAX_VALUE;
        for (int number : applicants.keySet()) {
            nextNumber = updateNextNumber(number, lastNumber, nextNumber);
        }
        return applicants.get(nextNumber);
    }

    // --- private methods ----------------------------------------------------

    private int updateNextNumber(int number, int lastNumber, int nextNumber) {
        if (number > lastNumber && number < nextNumber) {
            return number;
        }
        return nextNumber;
    }
}