package algorithmsfilter.zoo;

import java.util.ArrayList;
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

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs) {
        List<Animal> filteredAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getNumberOfLegs() == numberOfLegs) {
                filteredAnimals.add(animal);
            }
        }
        return filteredAnimals;
    }
}