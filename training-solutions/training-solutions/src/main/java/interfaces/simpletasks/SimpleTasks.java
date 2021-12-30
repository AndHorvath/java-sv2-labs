package interfaces.simpletasks;

import java.util.List;

public class SimpleTasks implements Runnable {

    // --- attributes ---------------------------------------------------------

    private List<String> tasks;

    // --- constructors -------------------------------------------------------

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getTasks() { return tasks; }

    // --- public methods -----------------------------------------------------

    @Override
    public void run() {
        while (nextStep()) { }
    }

    // --- private methods ----------------------------------------------------

    private boolean nextStep() {
        if (!isTaskListNullOrEmpty()) {
            tasks.remove(tasks.size() - 1);
        }
        return !isTaskListNullOrEmpty();
    }

    private boolean isTaskListNullOrEmpty() {
        return tasks == null || tasks.isEmpty();
    }
}