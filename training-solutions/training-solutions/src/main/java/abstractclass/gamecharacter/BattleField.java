package abstractclass.gamecharacter;

public class BattleField {

    // --- attributes ---------------------------------------------------------

    private int round;

    // --- getters and setters ------------------------------------------------

    public int getRound() { return round; }

    // --- public methods -----------------------------------------------------

    public Character fight(Character one, Character other) {
        validateParameters(one, other);
        while (oneHit(one, other) && oneHit(other, one)) {
            round++;
        }
        round++;
        return one.isAlive() ? one : other;
    }

    // --- private methods ----------------------------------------------------

    private boolean oneHit(Character attacker, Character defender) {
        attacker.primaryAttack(defender);
        if (defender.isAlive()) {
            attacker.secondaryAttack(defender);
        }
        return defender.isAlive();
    }

    private void validateParameters(Character one, Character other) {
        if (!one.isAlive() || !other.isAlive()) {
            throw new IllegalStateException("For having a fight characters must be alive.");
        }
    }
}