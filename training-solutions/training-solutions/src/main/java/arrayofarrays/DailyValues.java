package arrayofarrays;

public class DailyValues {

    private int[] monthsOf31Days = { 1, 3, 5, 7, 8, 10, 12 };

    public int[][] getValues() {
        int[][] dailyValuesDefault = new int[12][];

        for (int i = 0; i < dailyValuesDefault.length; i++) {
            if (isContained(monthsOf31Days, i + 1)) {
                dailyValuesDefault[i] = new  int[31];
            } else if (i + 1 == 2) {
                dailyValuesDefault[i] = new int[28];
            } else {
                dailyValuesDefault[i] = new int[30];
            }
        }
        return dailyValuesDefault;
    }

    private boolean isContained(int[] integerArray, int integer) {
        for (int arrayEntry: integerArray) {
            if (arrayEntry == integer) {
                return true;
            }
        }
        return false;
    }
}