package abstractclass.gamecharacter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {

    Archer archer;
    Archer enemy;

    Random random;
    Random enemyRandom;

    @BeforeEach
    void setUp() {
        random = new Random(100);
        enemyRandom = new Random(200);
        archer = new Archer(new Point(3, 2), random);
        enemy = new Archer(new Point(10, 5), enemyRandom);
    }

    @Test
    void getPositionTest() {
        assertEquals(3, archer.getPosition().getX());
        assertEquals(2, archer.getPosition().getY());
    }

    @Test
    void getRandomTest() {
        assertEquals(random, archer.getRandom());
    }

    @Test
    void getHitPointTest() {
        assertEquals(100, archer.getHitPoint());
    }

    @Test
    void getNumberOfArrowsTest() {
        assertEquals(100, archer.getNumberOfArrows());
    }

    @Test
    void isAliveTest() {
        assertTrue(archer.isAlive());

        enemy.hit(archer, 100);
        assertFalse(archer.isAlive());
    }

    @Test
    void primaryAttackTest() {
        archer.primaryAttack(enemy);
        assertEquals(94, enemy.getHitPoint());
    }

    @Test
    void secondaryAttackTest() {
        archer.secondaryAttack(enemy);
        assertEquals(99, archer.getNumberOfArrows());
        assertEquals(100, enemy.getHitPoint());
    }

    @Test
    void getActualPrimaryDamageTest() {
        assertEquals(6, archer.getActualPrimaryDamage());
    }

    @Test
    void hitTest() {
        archer.hit(enemy, 0);
        assertEquals(100, enemy.getHitPoint());

        archer.hit(enemy, 10);
        assertEquals(90, enemy.getHitPoint());
    }
}