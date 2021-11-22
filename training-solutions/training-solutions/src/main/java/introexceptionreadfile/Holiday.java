package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {

    public static void main(String[] args) {
        try {
            List<String> holidayList = Files.readAllLines(Paths.get("src/main/resources/holiday.txt"));
            System.out.println(holidayList);
        } catch (IOException exception) {
            System.out.println("Cannot read file.");
            exception.printStackTrace();
        }
    }
}