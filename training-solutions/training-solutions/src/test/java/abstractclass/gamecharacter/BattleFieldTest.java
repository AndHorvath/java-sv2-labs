package abstractclass.gamecharacter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BattleFieldTest {

    Random randomArcher;
    Random randomAxeWarrior;
    Archer archer;
    AxeWarrior axeWarrior;
    BattleField battleField;

    @BeforeEach
    void setUp() {
        randomArcher = new Random(100);
        randomAxeWarrior = new Random(200);

        archer = new Archer(new Point(3, 2), randomArcher);
        axeWarrior = new AxeWarrior(new Point(4, 3), randomAxeWarrior);

        battleField = new BattleField();
    }

    @Test
    void getRoundTest() {
        assertEquals(0, battleField.getRound());
    }

    @Test
    void fightTest() {
        Character placeHolder;
        placeHolder = new Archer(null, null);
        placeHolder.hit(archer, 70);
        placeHolder.hit(axeWarrior, 70);
        assertEquals(axeWarrior, battleField.fight(archer, axeWarrior));

        IllegalStateException exception;
        exception = assertThrows(IllegalStateException.class, () -> battleField.fight(archer, axeWarrior));
        assertEquals("For having a fight characters must be alive.", exception.getMessage());
    }
}