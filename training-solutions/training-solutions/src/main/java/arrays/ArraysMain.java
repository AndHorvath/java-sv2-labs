package arrays;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        String numberOfDaysAsString;
        String multiplicationTableAsString;
        int multiplicationTableSize;
        int[] ownFiveInLottery;
        int[] winnerFiveInLottery;
        double[] hourlyTemperatureValuesDay;
        double[] hourlyTemperatureValuesAnotherDay;

        numberOfDaysAsString = arrayHandler.numberOfDaysAsString();
        System.out.println(numberOfDaysAsString);
        System.out.println();

        multiplicationTableSize = 10;
        multiplicationTableAsString = arrayHandler.multiplicationTableAsString(multiplicationTableSize);
        System.out.println(multiplicationTableAsString);
        System.out.println();

        hourlyTemperatureValuesDay = new double[] {
                11.0, 12.3, 14.3, 16.0, 16.9, 17.0, 17.0, 18.5, 19.1, 21.1, 22.4, 25.0,
                25.2, 25.2, 25.0, 23.4, 21.4, 20.9, 19.1, 18.0, 15.5, 14.1, 13.0, 11.9 };
        hourlyTemperatureValuesAnotherDay = new double[] {
                11.0, 12.3, 14.3, 16.0, 16.9, 17.0, 17.0, 18.5, 19.1, 21.1, 22.4, 25.0,
                25.2, 25.2, 25.0, 23.4, 21.4, 20.9, 19.1, 18.0, 15.5, 14.1, 13.0, 11.9 };
        System.out.println(
                "The hourly temperature values of the two days given are" +
                (arrayHandler.sameTempValues(hourlyTemperatureValuesDay, hourlyTemperatureValuesAnotherDay) ?
                " the same." : " different or the number of data is not correct."));
        System.out.println();

        hourlyTemperatureValuesDay = new double[] {
                11.0, 12.3, 14.3, 16.0, 16.9, 17.0, 17.0, 18.5, 19.1, 21.1, 22.4, 25.0,
                25.2, 25.2, 25.0, 23.4, 21.4, 20.9, 19.1, 18.0, 15.5, 14.1, 13.0, 11.9 };
        hourlyTemperatureValuesAnotherDay = new double[] {
                11.0, 12.3, 14.3, 16.0, 16.9, 17.0, 17.0, 18.5, 19.1, 21.1, 22.4, 25.0,
                25.2, 25.2, 25.0, 23.4, 21.4, 20.9, 19.1, 18.0, 15.5, 14.1, 13.0, 11.9, 11.7 };
        System.out.println(
                "The hourly temperature values of the two days given are" +
                (arrayHandler.sameTempValuesDaylight(hourlyTemperatureValuesDay, hourlyTemperatureValuesAnotherDay) ?
                " the same." : " different or the number of data is not correct.") +
                " Changes to or from daylight saving time are ignored.");
        System.out.println();

        ownFiveInLottery = new int[] { 39, 47, 10, 71, 69 };
        winnerFiveInLottery = new int[] { 69, 47, 71, 10, 49 };
        System.out.println(
                "You have" +
                (arrayHandler.wonLottery(ownFiveInLottery, winnerFiveInLottery) ? "" : "n't") +
                " won the lottery.");
        System.out.println();

        System.out.println(Arrays.toString(ownFiveInLottery));
        System.out.println(Arrays.toString(winnerFiveInLottery));
    }
}