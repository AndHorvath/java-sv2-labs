package inheritancemethods.car;

import abstractclass.exercise.MathExercise;

public class Car {

    // --- attributes ---------------------------------------------------------

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    // --- constructors -------------------------------------------------------

    public Car(double fuelRate, double fuel, double tankCapacity) {
        validateFuel(fuel, tankCapacity);

        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    // --- getters and setters ------------------------------------------------

    public double getFuelRate() { return fuelRate; }
    public double getFuel() { return fuel; }
    public double getTankCapacity() { return tankCapacity; }

    // --- public methods -----------------------------------------------------

    public void modifyFuelAmount(double fuel) {
        validateFuel(fuel);
        this.fuel += fuel;
    }

    public void drive(int km) {
        validateDistanceToDrive(km);
        fuel -= (double) km * fuelRate / 100d;
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }

    // --- protected methods --------------------------------------------------

    protected void validateFuel(double fuel, double tankCapacity) {
        if (isGreater(fuel, tankCapacity)) {
            throw new IllegalArgumentException("Amount to be filled exceeds capacity.");
        }
    }

    protected void validateDistanceToDrive(int km) {
        if (isGreaterOrEqual(km, distanceCanBeDriven())) {
            throw new IllegalArgumentException("Not enough fuel for given distance.");
        }
    }

    protected double distanceCanBeDriven() {
        return fuel * 100d / fuelRate;
    }

    // --- private methods ----------------------------------------------------

    private void validateFuel(double fuel) {
        validateFuel(this.fuel + fuel, tankCapacity);
    }

    private boolean isGreater(double first, double second) {
        return first >= second + Math.pow(10d, -5d);
    }

    private boolean isEqual(double first, double second) {
        return Math.abs(first - second) < Math.pow(10d, -5d);
    }

    private boolean isGreaterOrEqual(double first, double second) {
        return isGreater(first, second) || isEqual(first, second);
    }
}