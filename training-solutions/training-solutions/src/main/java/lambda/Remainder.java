package lambda;

import java.util.List;

public class Remainder {

    public List<Integer> changeNumbersToReminders(List<Integer> numbers, int divisor) {
        numbers.replaceAll(number -> number % divisor);
        return numbers;
    }
}