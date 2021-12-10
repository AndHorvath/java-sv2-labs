package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    // --- attributes ---------------------------------------------------------

    private List<SimpleTime> timeTable;

    // --- constructors -------------------------------------------------------

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        timeTable = createTimeTable(firstHour, lastHour, everyMinute);
    }

    // --- getters and setters ------------------------------------------------

    public List<SimpleTime> getTimeTable() { return timeTable; }

    // --- public methods -----------------------------------------------------

    public SimpleTime getNextBus(SimpleTime actual) {
        List<SimpleTime> auxTimeTable = new ArrayList<>(timeTable);
        auxTimeTable.add(actual);
        sortTimeTable(auxTimeTable);

        int actualTimeIndex = auxTimeTable.indexOf(actual);
        if (actualTimeIndex == auxTimeTable.size() - 1) {
            throw new IllegalStateException("No departure after specified time.");
        } else {
            return auxTimeTable.get(actualTimeIndex + 1);
        }
    }

    // --- private methods --------------------------------------------------

    private List<SimpleTime> createTimeTable(int firstHour, int lastHour, int everyMinute) {
        List<SimpleTime> timeTable = new ArrayList<>();

        for (int i = firstHour; i <= lastHour; i++) {
            timeTable.add(new SimpleTime(i, everyMinute));
        }
        return timeTable;
    }

    private void sortTimeTable(List<SimpleTime> timeTable) {
        int i = 1;
        while (i > 0) {
            for (i = timeTable.size() - 1; i > 0; i--) {
                if (timeTable.get(i).getDifference(timeTable.get(i - 1)) < 0) {
                    transposeInTimeTable(timeTable, i, i - 1);
                    break;
                }
            }
        }
    }

    private void transposeInTimeTable(List<SimpleTime> timeTable, int firstIndex, int secondIndex) {
        try {
            SimpleTime auxTime = timeTable.get(firstIndex);
            timeTable.set(firstIndex, timeTable.get(secondIndex));
            timeTable.set(secondIndex, auxTime);
        } catch (IndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}