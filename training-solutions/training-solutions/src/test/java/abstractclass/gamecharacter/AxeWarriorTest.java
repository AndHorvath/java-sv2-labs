package abstractclass.gamecharacter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class AxeWarriorTest {

    AxeWarrior axeWarrior;
    AxeWarrior enemy;

    Random random;
    Random enemyRandom;

    @BeforeEach
    void setUp() {
        random = new Random(100);
        enemyRandom = new Random(200);
        axeWarrior = new AxeWarrior(new Point(3, 2), random);
        enemy = new AxeWarrior(new Point(4, 3), enemyRandom);
    }

    @Test
    void getPositionTest() {
        assertEquals(3, axeWarrior.getPosition().getX());
        assertEquals(2, axeWarrior.getPosition().getY());
    }

    @Test
    void getRandomTest() {
        assertEquals(random, axeWarrior.getRandom());
    }

    @Test
    void getHitPointTest() {
        assertEquals(100, axeWarrior.getHitPoint());
    }

    @Test
    void isAliveTest() {
        assertTrue(axeWarrior.isAlive());

        enemy.hit(axeWarrior, 100);
        assertFalse(axeWarrior.isAlive());
    }

    @Test
    void primaryAttackTest() {
        axeWarrior.primaryAttack(enemy);
        assertEquals(94, enemy.getHitPoint());
    }

    @Test
    void secondaryAttackTest() {
        AxeWarrior enemyTooFar = new AxeWarrior(new Point(7, 5), new Random());
        axeWarrior.secondaryAttack(enemyTooFar);
        assertEquals(100, enemyTooFar.getHitPoint());

        axeWarrior.secondaryAttack(enemy);
        assertEquals(89, enemy.getHitPoint());
    }

    @Test
    void getActualPrimaryDamageTest() {
        assertEquals(6, axeWarrior.getActualPrimaryDamage());
    }

    @Test
    void hitTest() {
        axeWarrior.hit(enemy, 0);
        assertEquals(100, enemy.getHitPoint());

        axeWarrior.hit(enemy, 10);
        assertEquals(90, enemy.getHitPoint());
    }
}