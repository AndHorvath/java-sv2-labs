package collectionsautoboxing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class VoteTest {

    Vote vote;
    Map<String, VoteResult> rawResult;
    Map<VoteResult, Integer> expectedOverallResult;

    @BeforeEach
    void setUp() {
        vote = new Vote();
        rawResult = new HashMap<>(Map.ofEntries(
            Map.entry("John Doe", VoteResult.YES),
            Map.entry("Jack Doe", VoteResult.NO),
            Map.entry("Jane Doe", VoteResult.ABSTAIN),
            Map.entry("Jill Doe", VoteResult.YES),
            Map.entry("Judd Doe", VoteResult.NO),
            Map.entry("Jeff Doe", VoteResult.YES)
        ));
    }

    @Test
    void getResultTest() {
        expectedOverallResult = new HashMap<>(Map.ofEntries(
            Map.entry(VoteResult.YES, 3),
            Map.entry(VoteResult.NO, 2),
            Map.entry(VoteResult.ABSTAIN, 1)
        ));
        assertEquals(expectedOverallResult, vote.getResult(rawResult));
    }
}