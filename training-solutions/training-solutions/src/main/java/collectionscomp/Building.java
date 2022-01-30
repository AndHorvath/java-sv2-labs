package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {

    // --- attributes ---------------------------------------------------------

    private String address;
    private int floors;
    private int area;


    // --- constructors -------------------------------------------------------

    public Building(String address, int floors, int area) {
        this.address = address;
        this.floors = floors;
        this.area = area;
    }

    // --- getters and setters ------------------------------------------------

    public String getAddress() { return address; }
    public int getFloors() { return floors; }
    public int getArea() { return area; }

    // --- public methods -----------------------------------------------------

    @Override
    public int compareTo(Building o) {
        return Integer.valueOf(floors).compareTo(o.floors);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(floors, building.floors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floors);
    }

    @Override
    public String toString() {
        return "Address: " + address + ", floors: " + floors + ", area: " + area;
    }

    // --- main method --------------------------------------------------------

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Street A", 2, 100));
        buildings.add(new Building("Street B", 4, 100));
        buildings.add(new Building("Street C", 3, 100));
        buildings.add(new Building("Street D", 1, 100));

        System.out.println(buildings);
    }
}