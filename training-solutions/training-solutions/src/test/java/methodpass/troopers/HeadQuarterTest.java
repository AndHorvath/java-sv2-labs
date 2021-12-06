package methodpass.troopers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeadQuarterTest {

    HeadQuarter headQuarter;
    Trooper trooperA;
    Trooper trooperB;
    Position positionA;
    Position positionB;

    @BeforeEach
    void setUp() {
        headQuarter = new HeadQuarter();
        trooperA = new Trooper("Jeff Doe");
        trooperB = new Trooper("Judd Doe");
        positionA = new Position(1d, 0d);
        positionB = new Position(8d, 0d);

        headQuarter.addTrooper(trooperA);
        headQuarter.addTrooper(trooperB);
    }

    @Test
    void getTroopersTest() {
        assertEquals(2,headQuarter.getTroopers().size());
    }

    @Test
    void addTrooperTest() {
        Trooper trooper = new Trooper("Jack Doe");
        headQuarter.addTrooper(trooper);

        assertEquals(3, headQuarter.getTroopers().size());
        assertEquals(trooper, headQuarter.getTroopers().get(2));
    }

    @Test
    void addTrooperTestWithNull() {
        IllegalArgumentException exception;
        exception = assertThrows(IllegalArgumentException.class, () -> headQuarter.addTrooper(null));
        assertEquals("Trooper cannot be null.", exception.getMessage());
    }

    @Test
    void moveTrooperByNameTest() {
        Position position = new Position(4d, 4d);
        headQuarter.moveTrooperByName("Judd Doe", position);

        assertEquals(4d, headQuarter.getTroopers().get(1).getPosition().getPosX());
        assertEquals(4d, headQuarter.getTroopers().get(1).getPosition().getPosY());
    }

    @Test
    void moveTrooperByNameTestWithNullOrEmptyName() {
        IllegalArgumentException exception;
        Position position = new Position(4d, 4d);

        exception = assertThrows(
                IllegalArgumentException.class, () -> headQuarter.moveTrooperByName(null, position));
        assertEquals("Name cannot be empty and target cannot be null.", exception.getMessage());

        exception = assertThrows(
                IllegalArgumentException.class, () -> headQuarter.moveTrooperByName(" ", position));
        assertEquals("Name cannot be empty and target cannot be null.", exception.getMessage());
    }

    @Test
    void moveTrooperByNameTestWithNullPosition() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> headQuarter.moveTrooperByName("Judd Doe", null));
        assertEquals("Name cannot be empty and target cannot be null.", exception.getMessage());
    }

    @Test
    void moveClosestTrooperTest() {
        Position position = new Position(4d, 4d);
        headQuarter.moveClosestTrooper(position);

        assertEquals(4d, headQuarter.getTroopers().get(0).getPosition().getPosX());
        assertEquals(4d, headQuarter.getTroopers().get(0).getPosition().getPosY());
    }

    @Test
    void moveClosestTrooperTestWithNull() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> headQuarter.moveClosestTrooper(null));
        assertEquals("Target cannot be null.", exception.getMessage());
    }
}