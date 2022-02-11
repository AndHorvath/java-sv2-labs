package sorting.cardealership;

import java.util.Comparator;

public class CarConstructionComparator implements Comparator<Car> {

    @Override
    public int compare(Car car, Car other) {
        return Integer.compare(
            car.getYearOfConstruction(), other.getYearOfConstruction());
    }
}