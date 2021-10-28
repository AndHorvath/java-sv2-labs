package arrays;

import java.util.Arrays;

public class ArrayHandler {

    // --- public methods -----------------------------------------------------

    public String numberOfDaysAsString() {
        int[] numberOfDaysArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        return Arrays.toString(numberOfDaysArray);
    }

    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return day.length == 24 && Arrays.equals(day, anotherDay);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        if (isNumberOfTempDataCorrect(day.length, anotherDay.length)) {
            int minLength = minInt(day.length, anotherDay.length);
            double[] auxDay = Arrays.copyOfRange(day, 0, minLength);
            double[] auxAnotherDay = Arrays.copyOfRange(anotherDay, 0, minLength);

            return Arrays.equals(auxDay, auxAnotherDay);
        }
        return false;
    }

    public boolean wonLottery(int[] ownFive, int[] winnerFive) {
        int[] auxOwnFive = Arrays.copyOf(ownFive, ownFive.length);
        int[] auxWinnerFive = Arrays.copyOf(winnerFive, winnerFive.length);

        Arrays.sort(auxOwnFive);
        Arrays.sort(auxWinnerFive);

        return Arrays.equals(auxOwnFive, auxWinnerFive);
    }

    // --- private methods ----------------------------------------------------

    private boolean isNumberOfTempDataCorrect(int dayData, int anotherDayData) {
        return
                dayData + anotherDayData == 47 && minInt(dayData, anotherDayData) == 23 ||
                dayData + anotherDayData == 49 && minInt(dayData, anotherDayData) == 24 ||
                dayData + anotherDayData == 48 && minInt(dayData, anotherDayData) == 24;
    }

    private int minInt(int firstInteger, int secondInteger) {
        return firstInteger <= secondInteger  ? firstInteger : secondInteger;
    }
}
