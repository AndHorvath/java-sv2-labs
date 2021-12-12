package dynamictypes.school;

public class SecondarySchool extends School {

    // --- constructors -------------------------------------------------------

    public SecondarySchool(String name, int numberOfYears) {
        super(name, numberOfYears);
    }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return super.toString() + " | SEC";
    }
}