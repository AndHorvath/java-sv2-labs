package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {

    // --- attributes ---------------------------------------------------------

    private List<String> roomsToHeat;
    private List<Thermometer> thermometers;
    private int temperatureLimit;

    // --- constructors -------------------------------------------------------

    public Thermostat() {
        roomsToHeat = new ArrayList<>();
        thermometers = new ArrayList<>();
        temperatureLimit = 23;
    }

    // --- getters and setters ------------------------------------------------

    public List<String> getRoomsToHeat() { return roomsToHeat; }
    public List<Thermometer> getThermometers() { return thermometers; }

    // --- public methods -----------------------------------------------------

    public void addThermometer(Thermometer thermometer) {
        thermometer.setObserver(
            new ThermometerObserver() {
                @Override
                public void handleTemperatureChange(int temperature, String room) {
                    if (temperature < temperatureLimit) {
                        roomsToHeat.add(room);
                    } else {
                        roomsToHeat.remove(room);
                    }
                }
            }
        );
        thermometers.add(thermometer);
    }
}