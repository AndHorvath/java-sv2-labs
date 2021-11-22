package introexceptionthrow;

public class Validation {

    public void validateName(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Invalid name.");
        }
    }

    public void validateAge(String ageString) {
        String auxAgeString = ageString;

        if (ageString == null || ageString.length() == 0) {
            throw new IllegalArgumentException("No age is given.");
        }
        if (ageString.charAt(0) == '-' && ageString.length() > 1) {
            auxAgeString = ageString.substring(1);
        }
        for (char character : auxAgeString.toCharArray()) {
            if (!Character.isDigit(character)) {
                throw new IllegalArgumentException("Age must be a number.");
            }
        }
        if (Integer.parseInt(ageString) < 0 || Integer.parseInt(ageString) > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
    }
}