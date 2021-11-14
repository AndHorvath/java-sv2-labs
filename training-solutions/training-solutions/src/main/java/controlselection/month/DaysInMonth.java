package controlselection.month;

import java.util.Locale;

public class DaysInMonth {

    public int getDaysInMonth(int year, String month) {
        String monthString = month.toLowerCase();
        boolean isLeapYear = isLeapYear(year);
        int daysInMonth;

        switch (monthString) {
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                daysInMonth = 31;
                break;
            case "április":
            case "június":
            case "szeptember":
            case "november":
                daysInMonth = 30;
                break;
            case "február":
                daysInMonth = isLeapYear ? 29 : 28;
                break;
            default:
                return 0;
        }
        return daysInMonth;
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}