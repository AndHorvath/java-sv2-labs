package lambdastreams.baseoperations;

import java.util.*;

public class Operations {

    // --- attributes ---------------------------------------------------------

    private List<Integer> integers;

    // --- constructors -------------------------------------------------------

    public Operations(List<Integer> integers) {
        this.integers = integers;
    }

    // --- getters and setters ------------------------------------------------

    public List<Integer> getIntegers() { return integers; }

    // --- public methods -----------------------------------------------------

    public Optional<Integer> min() {
        return integers.stream()
            .min(Integer::compareTo);
    }

    public Integer sum() {
        return integers.stream()
            .reduce(0, Integer::sum, Integer::sum);
    }

    public boolean isAllPositive() {
        return integers.stream()
            .allMatch(integer -> integer > 0);
    }

    public Set<Integer> getDistinctElements() {
        return  integers.stream()
            .collect(HashSet::new, Set::add, Set::addAll);
    }
}