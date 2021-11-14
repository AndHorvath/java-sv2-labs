package controlselection.greetings;

public class Greetings {

    // --- attributes ---------------------------------------------------------

    private final double EPS = 0.0001;

    // --- public methods -----------------------------------------------------

    public String greetAccordingDayTime(int hours, int minutes) {
        double timeInHours = (double) hours + (double) minutes / 60D;

        if (isGreater(timeInHours, 5D) && isLessOrEqual(timeInHours, 9D)) {
            return "Jó reggelt!";
        } else if (isGreater(timeInHours, 9D) && isLessOrEqual(timeInHours, 18.5D)) {
            return "Jó napot!";
        } else if (isGreater(timeInHours, 18.5D) && isLessOrEqual(timeInHours, 20D)) {
            return "Jó estét!";
        } else {
            return "Jó éjszakát!";
        }
    }

    // --- private methods ----------------------------------------------------

    private boolean isEqual(double firstDouble, double secondDouble) {
        return Math.abs(firstDouble - secondDouble) < EPS;
    }

    private boolean isGreater(double firstDouble, double secondDouble) {
        return firstDouble - secondDouble > EPS;
    }

    private boolean isGreaterOrEqual(double firstDouble, double secondDouble) {
        return isEqual(firstDouble, secondDouble) || isGreater(firstDouble, secondDouble);
    }

    private boolean isLess(double firstDouble, double secondDouble) {
        return !isGreaterOrEqual(firstDouble, secondDouble);
    }

    private boolean isLessOrEqual(double firstDouble, double secondDouble) {
        return isEqual(firstDouble, secondDouble) || isLess(firstDouble, secondDouble);
    }
}