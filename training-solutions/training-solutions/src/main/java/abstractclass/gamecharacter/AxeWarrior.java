package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character {

    // --- attributes ---------------------------------------------------------

    private static final int SECONDARY_DAMAGE_MULTIPLIER = 2;

    // --- constructors -------------------------------------------------------

    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    // --- public methods -----------------------------------------------------

    @Override
    public void secondaryAttack(Character enemy) {
        if (getPosition().getDistance(enemy.getPosition()) < 2) {
            hit(enemy, getActualSecondaryDamage());
        }
    }

    // --- private methods ----------------------------------------------------

    private int getActualSecondaryDamage() {
        return getRandom().nextInt(1, getActualPrimaryDamage() * SECONDARY_DAMAGE_MULTIPLIER + 1);
    }
}