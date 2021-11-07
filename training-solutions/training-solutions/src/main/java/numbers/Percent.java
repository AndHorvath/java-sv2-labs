package numbers;

public class Percent {

    public double getValue(int base, int percentage) {
        return (double) base / 100D * (double) percentage;
    }

    public double getBase(int value, int percentage) {
        return (double) value * 100D / (double) percentage;
    }

    public double getPercent(int base, int value) {
        return (double) value * 100D / (double) base;
    }
}