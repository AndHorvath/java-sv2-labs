package staticattrmeth;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private List<Dog> dogs;
    private static long code = 1L;

    // --- constructors -------------------------------------------------------

    public Vet() {
        this.dogs = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Dog> getDogs() { return dogs; }

    public static long getCode() { return code; }

    // --- public methods -----------------------------------------------------

    public void addDog(Dog dog) {
        dog.setCode(code);
        dogs.add(dog);
        code++;
    }
}