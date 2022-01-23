package nestedclasses.thermo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ThermometerTest {

    Thermometer thermometer;
    Observer observer;

    @BeforeEach
    void setUp() {
        thermometer = new Thermometer("room", 22);
    }

    @Test
    void getRoomTest() {
        assertEquals("room", thermometer.getRoom());
    }

    @Test
    void getTemperatureTest() {
        assertEquals(22, thermometer.getTemperature());
    }

    @Test
    void getObserverTest() {
        assertNull(thermometer.getObserver());
    }

    @Test
    void setObserverTest() {
        observer = new Observer();
        thermometer.setObserver(observer);
        assertNotNull(thermometer.getObserver());
    }

    @Test
    void setTemperatureTest() {
        observer = new Observer();
        thermometer.setObserver(observer);
        thermometer.setTemperature(21);

        assertEquals("room", observer.room);
        assertEquals(21, observer.temperature);
        assertEquals(21, thermometer.getTemperature());
    }

    // --- inner classes ------------------------------------------------------

    static class Observer implements ThermometerObserver {

        private String room;
        private int temperature;

        @Override
        public void handleTemperatureChange(int temperature, String room) {
            this.room = room;
            this.temperature = temperature;
        }
    }
}