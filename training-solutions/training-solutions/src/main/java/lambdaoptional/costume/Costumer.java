package lambdaoptional.costume;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Costumer {

    // --- attributes ---------------------------------------------------------

    private List<Costume> costumes;

    // --- constructors -------------------------------------------------------

    public Costumer() {
        costumes = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Costume> getCostumes() { return costumes; }

    // --- public methods -----------------------------------------------------

    public void addCostume(Costume costume) {
        costumes.add(costume);
    }

    public Optional<Costume> findFirstCostumeWithKeyword(String keyword) {
        return findFirst(costume -> costume.getDescription().contains(keyword));
    }

    public Optional<Costume> findFirstCheaperCostume(int maxPrice) {
        return findFirst(costume -> costume.getPrice() < maxPrice);
    }

    public Optional<Costume> findFirstCostumeSameSize(Size size) {
        return findFirst(costume -> costume.getSize() == size);
    }

    // --- private methods ----------------------------------------------------

    private Optional<Costume> findFirst(Predicate<Costume> condition) {
        for (Costume costume : costumes) {
            if (condition.test(costume)) {
                return Optional.of(costume);
            }
        }
        return Optional.empty();
    }
}