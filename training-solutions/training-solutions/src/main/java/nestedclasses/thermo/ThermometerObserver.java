package nestedclasses.thermo;

public interface ThermometerObserver {

    void handleTemperatureChange(int temperature, String room);
}