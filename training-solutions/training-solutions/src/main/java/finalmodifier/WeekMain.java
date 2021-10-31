package finalmodifier;

public class WeekMain {

    public static void main(String[] args) {

        Week.WEEKDAYS.set(1, "Wednesday");
        System.out.println(Week.WEEKDAYS);
    }
}