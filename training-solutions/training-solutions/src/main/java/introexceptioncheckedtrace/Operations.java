package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/underground.txt"));
    }

    public String getDailySchedule(List<String> metroCars) {
        StringBuilder result = new StringBuilder(LocalDate.now().toString()).append(",");
        String separator = " ";

        for (String car : metroCars) {
            if (car.indexOf("2") == 0) {
                result.append(separator).append(car);
            }
        }
        return result.toString();
    }
}