package interfaces.animal;

import java.util.List;

public class Zoo {

    // --- attributes ---------------------------------------------------------

    private List<Animal> animals;

    // --- constructors -------------------------------------------------------

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    // --- getters and setters ------------------------------------------------

    public List<Animal> getAnimals() { return animals; }

    // --- public methods -----------------------------------------------------

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public int getNumberOfAllLegs() {
        int numberOfAllLegs = 0;
        for (Animal animal : animals) {
            numberOfAllLegs += animal.getNumberOfLegs();
        }
        return numberOfAllLegs;
    }
}