package exceptions.sum;

public class NumbersSum {

    // --- public methods -----------------------------------------------------

    public int getSum(int[] numbers) {
        validateParameter(numbers);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int getSum(String[] numbers) {
        validateParameter(numbers);

        int sum = 0;
        for (String number : numbers) {
            try {
                sum += Integer.parseInt(number);
            } catch (NumberFormatException exception) {
                throw new IllegalArgumentException("Wrong number format.", exception);
            }
        }
        return sum;
    }

    // --- private methods ----------------------------------------------------

    private void validateParameter(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException(getNullValidationMessage());
        }
    }

    private void validateParameter(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException(getNullValidationMessage());
        }
    }

    private String getNullValidationMessage() {
        return "Parameter cannot be null.";
    }
}