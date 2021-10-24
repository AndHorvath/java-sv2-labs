package statements;

import java.util.Scanner;

public class TimeHandler {

    public Time createUserTime(Scanner scanner, String stringInfix) {
        int hour;
        int minute;
        int second;

        System.out.println("Please, enter the " + stringInfix + " time!");

        System.out.println("Specify the hour!");
        hour = scanner.nextInt();

        System.out.println("Specify the minutes!");
        minute = scanner.nextInt();

        System.out.println("Specify the seconds!");
        second = scanner.nextInt();

        return new Time(hour, minute, second);
    }

    public void handleTimes(Time firstTime, Time secondTime) {
        String firstTimeString = firstTime.toString();
        String secondTimeString = secondTime.toString();
        int firstTimeMinutes = firstTime.getInMinutes();
        int secondTimeSeconds = secondTime.getInSeconds();
        boolean isEarlier = firstTime.earlierThan(secondTime);

        System.out.println("The first time is " + firstTimeString + ", that is " + firstTimeMinutes + " minutes.");
        System.out.println("The second time is " + secondTimeString + ", that is " + secondTimeSeconds + " seconds.");
        System.out.println("The first is earlier than the second, that is " + isEarlier + ".");
    }
}
