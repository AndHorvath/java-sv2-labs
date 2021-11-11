package formatlocaleprintf;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Run {

    // --- attributes ---------------------------------------------------------

    private final String runner;
    private final List<Double> runs;

    // --- constructors -------------------------------------------------------

    public Run(String runner) {
        this.runner = runner;
        runs = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public String getRunner() { return runner; }

    public List<Double> getRuns() { return runs; }

    // --- public methods -----------------------------------------------------

    public void addRun(Double run) {
        runs.add(run);
    }

    public String printFormattedRunText() {
        String dateString = LocalDate.now().toString();

        return String.format(
                "Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %3.1f km-t futottál. Csak így tovább!",
                runner, dateString, runs.size(), runs.get(runs.size() - 1));
    }
}