package lambdaoptional.costume;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CostumerTest {

    Costumer costumer;

    Costume costumeA;
    Costume costumeB;
    Costume costumeC;
    Costume costumeD;

    @BeforeEach
    void setUp() {
        costumer = new Costumer();

        costumeA = new Costume("costume AC", Size.S, 400);
        costumeB = new Costume("costume BC", Size.M, 200);
        costumeC = new Costume("costume CC", Size.M, 300);
        costumeD = new Costume("costume DC", Size.L, 100);

        costumer.addCostume(costumeA);
        costumer.addCostume(costumeB);
        costumer.addCostume(costumeC);
        costumer.addCostume(costumeD);
    }

    @Test
    void testGetCostumes() {
        assertEquals(List.of(costumeA, costumeB, costumeC, costumeD), costumer.getCostumes());
    }

    @Test
    void testAddCostume() {
        Costume costumeE = new Costume("costume EC", Size.S, 100);
        costumer.addCostume(costumeE);

        assertEquals(List.of(costumeA, costumeB, costumeC, costumeD, costumeE), costumer.getCostumes());
    }

    @Test
    void testFindFirstCostumeWithKeyword() {
        assertTrue(costumer.findFirstCostumeWithKeyword("CC").isPresent());
        assertEquals(costumeC, costumer.findFirstCostumeWithKeyword("CC").get());

        assertFalse(costumer.findFirstCostumeWithKeyword("EC").isPresent());
        assertEquals(Optional.empty(), costumer.findFirstCostumeWithKeyword("EC"));
        assertEquals(
            "", costumer.findFirstCostumeWithKeyword("EC").orElseGet(this::getDummyCostume).getDescription());
    }

    @Test
    void testFindFirstCheaperCostume() {
        assertTrue(costumer.findFirstCheaperCostume(300).isPresent());
        assertEquals(costumeB, costumer.findFirstCheaperCostume(300).get());

        assertFalse(costumer.findFirstCheaperCostume(100).isPresent());
        assertEquals(Optional.empty(), costumer.findFirstCheaperCostume(100));
        assertEquals(
            "", costumer.findFirstCheaperCostume(100).orElseGet(this::getDummyCostume).getDescription());
    }

    @Test
    void testFindFirstCostumeSameSize() {
        assertTrue(costumer.findFirstCostumeSameSize(Size.L).isPresent());
        assertEquals(costumeD, costumer.findFirstCostumeSameSize(Size.L).get());

        assertFalse(costumer.findFirstCostumeSameSize(Size.XL).isPresent());
        assertEquals(Optional.empty(), costumer.findFirstCostumeSameSize(Size.XL));
        assertEquals(
            "", costumer.findFirstCostumeSameSize(Size.XL).orElseGet(this::getDummyCostume).getDescription());
    }

    // --- private methods ----------------------------------------------------

    private Costume getDummyCostume() {
        return new Costume("", Size.S, 0);
    }
}