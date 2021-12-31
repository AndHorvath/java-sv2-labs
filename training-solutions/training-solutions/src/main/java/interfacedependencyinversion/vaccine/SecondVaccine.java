package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {

    // --- attributes ---------------------------------------------------------

    private List<Person> vaccinationList;

    // --- constructors -------------------------------------------------------

    public SecondVaccine() {
        vaccinationList = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    @Override
    public List<Person> getVaccinationList() { return vaccinationList; }

    // --- public methods -----------------------------------------------------

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        List<Person> youngPeopleList = new ArrayList<>();
        List<Person> othersList = new ArrayList<>();

        for (Person person : registrated) {
            if (isPregnantOrIll(person)) {
                continue;
            }
            if (person.getAge() <= 65) {
                youngPeopleList.add(person);
            } else {
                othersList.add(person);
            }
        }
        vaccinationList.addAll(youngPeopleList);
        vaccinationList.addAll(othersList);
    }

    // --- private methods ----------------------------------------------------

    private boolean isPregnantOrIll(Person person) {
        return
            person.getPregnancy() == Pregnancy.YES ||
            person.getChronic() == ChronicDisease.YES;
    }
}