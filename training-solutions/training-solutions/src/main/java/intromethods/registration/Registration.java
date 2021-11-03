package intromethods.registration;

import java.time.LocalDate;

public class Registration {

    public String createName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public LocalDate createDateOfBirth(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
}