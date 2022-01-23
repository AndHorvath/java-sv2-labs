package nestedclasses.thermo;

public class Thermometer {

    // --- attributes ---------------------------------------------------------

    private String room;
    private int temperature;
    private ThermometerObserver observer;

    // --- constructors -------------------------------------------------------

    public Thermometer(String room, int temperature) {
        this.room = room;
        this.temperature = temperature;
    }

    // --- getters and setters ------------------------------------------------

    public String getRoom() { return room; }
    public int getTemperature() { return temperature; }
    public ThermometerObserver getObserver() { return observer; }

    // --- public methods -----------------------------------------------------

    public void setObserver(ThermometerObserver observer) {
        this.observer = observer;
        onTemperatureChanged();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        onTemperatureChanged();
    }

    // --- private methods ----------------------------------------------------

    private void onTemperatureChanged() {
        if (observer != null) {
            observer.handleTemperatureChange(temperature, room);
        }
    }
}