package compositionlist.computer;

public class Cpu {

    // --- attributes ---------------------------------------------------------

    private String model;
    private double clockSignal;

    // --- constructors -------------------------------------------------------

    public Cpu(String model, double clockSignal) {
        this.model = model;
        this.clockSignal = clockSignal;
    }

    // --- getters and setters ------------------------------------------------

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getClockSignal() { return clockSignal; }
    public void setClockSignal(double clockSignal) { this.clockSignal = clockSignal; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString(){
        return model + " " + clockSignal;
    }
}