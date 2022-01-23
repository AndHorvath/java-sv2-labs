package nestedclasses.thermo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ThermostatTest {

    Thermostat thermostat;
    Thermometer thermometerA;
    Thermometer thermometerB;

    @BeforeEach
    void setUp() {
        thermostat = new Thermostat();
    }

    @Test
    void getRoomsToHeatTest() {
        assertEquals(new ArrayList<>(), thermostat.getRoomsToHeat());
    }

    @Test
    void getThermometersTest() {
        assertEquals(new ArrayList<>(), thermostat.getThermometers());
    }

    @Test
    void addThermometerTest() {
        thermometerA = new Thermometer("roomA", 22);
        thermometerB = new Thermometer("roomB", 23);
        thermostat.addThermometer(thermometerA);
        thermostat.addThermometer(thermometerB);

        assertEquals(new ArrayList<>(List.of(thermometerA, thermometerB)), thermostat.getThermometers());
        assertEquals(new ArrayList<>(List.of("roomA")), thermostat.getRoomsToHeat());

        thermometerB.setTemperature(21);
        assertEquals(new ArrayList<>(List.of("roomA", "roomB")), thermostat.getRoomsToHeat());
    }
}