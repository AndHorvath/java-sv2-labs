package interfacestaticmethods.schoolchild;

public interface PrimarySchoolChild {

    // --- public methods -----------------------------------------------------

    static PrimarySchoolChild of(int age) {
        if (isLowerClassAge(age)) {
            return new LowerClassSchoolChild(age);
        } else if (isUpperClassAge(age)) {
            return new UpperClassSchoolChild(age);
        } else {
            throw new IllegalArgumentException("Age must be a number between 6 and 14.");
        }
    }

    // --- private methods ----------------------------------------------------

    private static boolean isLowerClassAge(int age) {
        return 6 <= age && age <= 10;
    }

    private static boolean isUpperClassAge(int age) {
        return 11 <= age && age <= 14;
    }
}