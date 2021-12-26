package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    // --- attributes ---------------------------------------------------------

    private static final int MAX_DAMAGE = 10;
    private static final int MAX_DEFENCE = 5;

    private Point position;
    private Random random;
    private int hitPoint;

    // --- constructors -------------------------------------------------------

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;

        hitPoint = 100;
    }

    // --- getters and setters ------------------------------------------------

    public Point getPosition() { return position; }
    public Random getRandom() { return random; }
    public int getHitPoint() { return hitPoint; }

    // --- public methods -----------------------------------------------------

    public boolean isAlive() {
        return hitPoint > 0;
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    public abstract void secondaryAttack(Character enemy);

    // --- protected methods --------------------------------------------------

    protected int getActualPrimaryDamage() {
        return random.nextInt(1, MAX_DAMAGE + 1);
    }

    protected void hit(Character enemy, int damage) {
        if (damage > enemy.getActualDefense()) {
            enemy.decreaseHitPoint(damage);
        }
    }

    // --- private methods ----------------------------------------------------

    private int getActualDefense() {
        return random.nextInt(0, MAX_DEFENCE + 1);
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }
}