package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {

    // --- attributes ---------------------------------------------------------

    private List<Person> vaccinationList;

    // --- constructors -------------------------------------------------------

    public FirstVaccine() {
        vaccinationList = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    @Override
    public List<Person> getVaccinationList() { return vaccinationList; }

    // --- public methods -----------------------------------------------------

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        List<Person> pregnantPeopleList = new ArrayList<>();
        List<Person> eldersList = new ArrayList<>();
        List<Person> othersList = new ArrayList<>();

        for (Person person : registrated) {
            if (person.getPregnancy() == Pregnancy.YES) {
                pregnantPeopleList.add(person);
            } else if (person.getAge() > 65) {
                eldersList.add(person);
            } else {
                othersList.add(person);
            }
        }
        vaccinationList.addAll(pregnantPeopleList);
        vaccinationList.addAll(eldersList);
        vaccinationList.addAll(othersList);
    }
}