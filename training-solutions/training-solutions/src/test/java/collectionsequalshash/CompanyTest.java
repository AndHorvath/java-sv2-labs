package collectionsequalshash;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    Company companyAA;
    Company companyAB;
    Company companyCA;
    Company otherAA;

    @BeforeEach
    void setUp() {
        companyAA = new Company("Company A", "AA-11");
    }

    @Test
    void getNameTest() {
        assertEquals("Company A", companyAA.getName());
    }

    @Test
    void getTaxNumberTest() {
        assertEquals("AA-11", companyAA.getTaxNumber());
    }

    @Test
    void testEqualsTest() {
        companyAB = new Company("Company A", "BB-22");
        companyCA = new Company("Company C", "AA-11");
        otherAA = new Company("Company A", "AA-11");

        assertNotEquals(companyAA, companyAB);
        assertNotEquals(companyAA, companyCA);
        assertEquals(companyAA, otherAA);
    }

    @Test
    void testHashCodeTest() {
        otherAA = new Company("Company A", "AA-11");
        assertEquals(companyAA.hashCode(), otherAA.hashCode());
    }
}