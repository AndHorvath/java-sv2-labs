package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {

    // --- attributes ---------------------------------------------------------

    private Map<String, Integer> classesAndWeights;

    // --- constructors -------------------------------------------------------

    public Paper() {
        classesAndWeights = new HashMap<>();
    }

    // --- getters and setters ------------------------------------------------

    public Map<String, Integer> getClassesAndWeights() { return classesAndWeights; }

    // --- public methods -----------------------------------------------------

    public void putFurtherPaper(String className, int kilograms) {
        validateParameter(kilograms);
        if (kilograms > 0) {
            updateClassesAndWeights(className, kilograms);
        }
    }

    public String getWinnerClass() {
        String winnerClass = null;
        for (String actualClass : classesAndWeights.keySet()) {
            winnerClass = updateWinnerClass(winnerClass, actualClass);
        }
        return winnerClass;
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (int value : classesAndWeights.values()) {
            totalWeight += value;
        }
        return totalWeight;
    }

    // --- private methods ----------------------------------------------------

    private void validateParameter(int kilograms) {
        if (kilograms < 0) {
            throw new IllegalArgumentException("Weight cannot be negative.");
        }
    }

    private void updateClassesAndWeights(String className, int kilograms) {
        if (classesAndWeights.containsKey(className)) {
            classesAndWeights.put(className, classesAndWeights.get(className) + kilograms);
        } else {
            classesAndWeights.put(className, kilograms);
        }
    }

    private String updateWinnerClass(String winnerClass, String actualClass) {
        if (winnerClass == null ||
            classesAndWeights.get(actualClass) > classesAndWeights.get(winnerClass)) {
            winnerClass = actualClass;
        }
        return winnerClass;
    }
}