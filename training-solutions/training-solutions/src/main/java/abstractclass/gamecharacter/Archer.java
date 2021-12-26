package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {

    // --- attributes ---------------------------------------------------------

    private int numberOfArrows;

    // --- constructors -------------------------------------------------------

    public Archer(Point position, Random random) {
        super(position, random);

        numberOfArrows = 100;
    }

    // --- getters and setters ------------------------------------------------

    public int getNumberOfArrows() { return numberOfArrows; }

    // --- public methods -----------------------------------------------------

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }

    // --- private methods ----------------------------------------------------

    private int getActualSecondaryDamage() {
        return getRandom().nextInt(1, 6);
    }

    private void shootingAnArrow(Character enemy) {
        numberOfArrows--;
        hit(enemy, getActualSecondaryDamage());
    }
}