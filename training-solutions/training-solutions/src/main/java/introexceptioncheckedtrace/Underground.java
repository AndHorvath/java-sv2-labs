package introexceptioncheckedtrace;

import java.io.IOException;

public class Underground {

    public static void main(String[] args) {
        Operations operations = new Operations();
        String dailySchedule;
        try {
            dailySchedule = operations.getDailySchedule(operations.readFile());
            System.out.println(dailySchedule);
        } catch (IOException exception) {
            System.out.println("Cannot read file.");
            exception.printStackTrace();
        }
    }
}