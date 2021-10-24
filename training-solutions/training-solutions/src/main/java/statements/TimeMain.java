package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimeHandler timeHandler = new TimeHandler();
        Time firstTime;
        Time secondTime;

        firstTime = timeHandler.createUserTime(scanner, "first");
        secondTime = timeHandler.createUserTime(scanner, "second");

        timeHandler.handleTimes(firstTime, secondTime);
    }
}
