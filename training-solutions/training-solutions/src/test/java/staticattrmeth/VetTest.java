package staticattrmeth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    Vet vet;
    Dog dog;

    @BeforeEach
    void setUp() {
        vet = new Vet();
        dog = new Dog("William", Species.MIXTURE, 2);
        vet.addDog(dog);
    }

    @Test
    void getDogsTest() {
        assertEquals(new ArrayList<>(Arrays.asList(dog)), vet.getDogs());
    }

    @Test
    void getCodeTest() {
        assertEquals(Vet.getCode() - 1L, vet.getDogs().get(0).getCode());
    }

    @Test
    void addDogTest() {
        vet.addDog(new Dog("Philip", Species.MIXTURE, 2));
        assertEquals(Vet.getCode() - 1L, vet.getDogs().get(1).getCode());

        Vet other = new Vet();
        other.addDog(new Dog("Robert", Species.MIXTURE, 2));
        assertEquals(vet.getDogs().get(1).getCode() + 1L, other.getDogs().get(0).getCode());
        assertEquals(Vet.getCode() - 1, other.getDogs().get(0).getCode());
    }}