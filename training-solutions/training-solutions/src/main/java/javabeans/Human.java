package javabeans;

public class Human {

    // --- properties ---------------------------------------------------------

    private String name;
    private double weight;
    private int iq;

    // --- constructors -------------------------------------------------------

    public Human() { }

    public Human(String name, double weight, int iq) {
        this.name = name;
        this.weight = weight;
        this.iq = iq;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public int getIq() { return iq; }
    public void setIq(int iq) { this.iq = iq; }
}