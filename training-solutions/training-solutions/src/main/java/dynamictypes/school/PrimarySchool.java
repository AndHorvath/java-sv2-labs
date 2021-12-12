package dynamictypes.school;

public class PrimarySchool extends School {

    // --- constructors -------------------------------------------------------

    public PrimarySchool(String name, int numberOfYears) {
        super(name, numberOfYears);
    }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return super.toString() + " | PRIM";
    }
}