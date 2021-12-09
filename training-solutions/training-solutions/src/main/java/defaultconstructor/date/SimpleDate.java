package defaultconstructor.date;

import java.util.Arrays;

public class SimpleDate {

    // --- attributes ---------------------------------------------------------

    private int year;
    private int month;
    private int day;

    // --- getters and setters ------------------------------------------------

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    // --- public methods -----------------------------------------------------

    public void setDate(int year, int month, int day) {
        validateParameters(year, month, day);

        this.year = year;
        this.month = month;
        this.day = day;
    }

    // --- private methods ----------------------------------------------------

    private void validateParameters(int year, int month, int day) {
        if (!isCorrect(year, month, day)) {
            throw new IllegalArgumentException("Incorrect date data.");
        }
    }

    private boolean isCorrect(int year, int month, int day) {
        if (year < 1900 || month < 1  || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if (is30DayMonth(month)) {
            return day <= 30;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        }
        return true;
    }

    private boolean is30DayMonth(int month) {
        return Arrays.asList(4, 6, 9, 11).contains(month);
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}