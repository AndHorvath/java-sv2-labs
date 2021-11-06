package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    // --- attributes ---------------------------------------------------------

    private List<Person> personList;

    // --- constructors -------------------------------------------------------

    public Exam() {
        personList = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Person> getPersonList() { return personList; }

    // --- public methods -----------------------------------------------------

    public void addPerson(Person person) {
        personList.add(person);
    }
}