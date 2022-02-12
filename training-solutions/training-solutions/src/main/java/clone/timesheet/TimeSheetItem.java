package clone.timesheet;

import java.time.LocalDateTime;

public class TimeSheetItem {

    // --- attributes ---------------------------------------------------------

    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    // --- constructors -------------------------------------------------------

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem other) {
        this.employee = other.employee;
        this.project = other.project;
        this.from = other.from;
        this.to = other.to;
    }

    // --- getters and setters ------------------------------------------------

    public String getEmployee() { return employee; }
    public String getProject() { return project; }
    public LocalDateTime getFrom() { return from; }
    public LocalDateTime getTo() { return to; }

    // --- public methods -----------------------------------------------------

    public TimeSheetItem copyWithDifferentEmployee(TimeSheetItem timeSheetItem, String newEmployee) {
        TimeSheetItem itemWithDifferentEmployee = new TimeSheetItem(timeSheetItem);
        itemWithDifferentEmployee.employee = newEmployee;
        return itemWithDifferentEmployee;
    }
}