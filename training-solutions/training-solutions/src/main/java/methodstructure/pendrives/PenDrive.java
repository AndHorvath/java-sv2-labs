package methodstructure.pendrives;

import algorithmstransformation.student.Person;

public class PenDrive {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int capacity;
    private int price;

    // --- constructors -------------------------------------------------------

    public PenDrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }

    public int getCapacity() { return capacity; }

    public int getPrice() { return price; }

    // --- public methods -----------------------------------------------------

    @Override
    public String toString() {
        return name + " " + capacity + " " + price;
    }

    public void risePrice(int percent) {
        price = (int) Math.round(price * (1d + percent / 100d));
    }

    public int comparePricePerCapacity(PenDrive other) {
        if (isGreater(getPricePerCapacity(this), getPricePerCapacity(other))) {
            return 1;
        } else if(isGreater(getPricePerCapacity(other), getPricePerCapacity(this))) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean isCheaperThan(PenDrive other) {
        return price < other.getPrice();
    }

    // --- private methods ----------------------------------------------------

    private boolean isGreater(double a, double b) {
        return a > b + Math.pow(10d, -5d);
    }

    private double getPricePerCapacity(PenDrive penDrive) {
        return (double) penDrive.getPrice() / (double) penDrive.getCapacity();
    }
}