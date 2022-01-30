package collectionsmap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class CastingTest {

    Casting casting;

    @BeforeEach
    void setUp() {
        casting = new Casting();
    }

    @Test
    void callNextApplicantTest() {
        int lastNumber = 40;
        Map<Integer, String> applicants = new HashMap<>(Map.ofEntries(
            Map.entry(77, "applicant 77"),
            Map.entry(95, "applicant 95"),
            Map.entry(19, "applicant 19"),
            Map.entry(45, "applicant 45"),
            Map.entry(82, "applicant 82")
        ));
        assertEquals("applicant 45", casting.callNextApplicant(lastNumber, applicants));
    }
}