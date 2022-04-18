package lambdaintro.flat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RealEstateAgencyTest {

    RealEstateAgency realEstateAgency;

    Flat flatA;
    Flat flatB;
    Flat flatC;
    Flat flatD;

    Throwable exception;

    @BeforeEach
    void setUp() {
        realEstateAgency = new RealEstateAgency();

        flatA = new Flat("57 Main Str., Newtown 121", 50.7, 157_000);
        flatB = new Flat("75 Main Str., Newtown 121", 70.5, 175_000);
        flatC = new Flat("55 Main Str., Oldtown 212", 50.5, 155_000);
        flatD = new Flat("77 Main Str., Oldtown 212", 70.7, 177_000);

        realEstateAgency.addFlat(flatA);
        realEstateAgency.addFlat(flatB);
        realEstateAgency.addFlat(flatC);
        realEstateAgency.addFlat(flatD);
    }

    @Test
    void testGetFlats() {
        List<Flat> expectedFlats = List.of(flatA, flatB, flatC, flatD);
        assertEquals(expectedFlats, realEstateAgency.getFlats());
    }

    @Test
    void testAddFlat() {
        Flat flatE = new Flat("100 Main Str., Newtown 121", 100.0, 1_000_000);
        realEstateAgency.addFlat(flatE);

        List<Flat> expectedFlats = List.of(flatA, flatB, flatC, flatD, flatE);
        assertEquals(expectedFlats, realEstateAgency.getFlats());
    }

    @Test
    void testFindFirstCheaperFlat() {
        assertEquals(flatC, realEstateAgency.findFirstCheaperFlat(156_000));

        exception = assertThrows(
            IllegalArgumentException.class, () -> realEstateAgency.findFirstCheaperFlat(155_000));
        assertEquals(getConditionNotMetMessage(), exception.getMessage());
    }

    @Test
    void testFindFirstGreaterFlat() {
        assertEquals(flatB, realEstateAgency.findFirstGreaterFlat(70.0));

        exception = assertThrows(
            IllegalArgumentException.class, () -> realEstateAgency.findFirstGreaterFlat(70.7));
        assertEquals(getConditionNotMetMessage(), exception.getMessage());
    }

    @Test
    void testFindFirstFlatInSameTown() {
        assertEquals(flatC, realEstateAgency.findFirstFlatInSameTown("Oldtown"));

        exception = assertThrows(
            IllegalArgumentException.class, () -> realEstateAgency.findFirstFlatInSameTown("Othertown"));
        assertEquals(getConditionNotMetMessage(), exception.getMessage());
    }

    // --- private methods ----------------------------------------------------

    private String getConditionNotMetMessage() {
        return "No flat with specified condition.";
    }
}