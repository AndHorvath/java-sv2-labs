package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> rawResult) {
        Map<VoteResult, Integer> overallResult = initializeOverallResult();
        for (String name : rawResult.keySet()) {
            overallResult.put(rawResult.get(name), overallResult.get(rawResult.get(name)) + 1);
        }
        return overallResult;
    }

    // --- private methods ----------------------------------------------------

    private Map<VoteResult, Integer> initializeOverallResult() {
        return
            new HashMap<>(Map.ofEntries(
                Map.entry(VoteResult.YES, 0),
                Map.entry(VoteResult.NO, 0),
                Map.entry(VoteResult.ABSTAIN, 0)
            ));
    }
}