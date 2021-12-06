package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    // --- attributes ---------------------------------------------------------

    private List<Trooper> troopers;

    // --- constructors -------------------------------------------------------

    public HeadQuarter() {
        this.troopers = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Trooper> getTroopers() { return troopers; }

    // --- public methods -----------------------------------------------------

    public void addTrooper(Trooper trooper) {
        validateParameter(trooper);
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target) {
        validateParameters(name, target);

        Trooper trooperToMove = findTrooperByName(name);
        moveTrooper(trooperToMove, target);
    }

    public void moveClosestTrooper(Position target) {
        validateParameter(target);

        Trooper trooperToMove = findClosestTrooper(target);
        moveTrooper(trooperToMove, target);
    }

    // --- private methods ----------------------------------------------------

    private Trooper findTrooperByName(String name) {
        for (Trooper trooper : troopers) {
            if (trooper.getName().equals(name)) {
                return trooper;
            }
        }
        throw new IllegalArgumentException("There is no trooper with the given name.");
    }

    private Trooper findClosestTrooper(Position target) {
        Trooper closestTrooper = null;
        for (Trooper trooper : troopers) {
            if (closestTrooper == null || trooper.isCloserThan(closestTrooper, target)) {
                closestTrooper = trooper;
            }
        }
        return closestTrooper;
    }

    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }

    private void validateParameter(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException("Trooper cannot be null.");
        }
    }

    private void validateParameter(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Target cannot be null.");
        }
    }

    private void validateParameters(String name, Position target) {
        if (name == null || name.trim().length() == 0 || target == null) {
            throw new IllegalArgumentException("Name cannot be empty and target cannot be null.");
        }
    }

    /*
    A moveTrooperByName és a moveClosestTrooper metódusok visszahatnak a hívó félre.
    */
}