package sorting.cardealership;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

    @Override
    public int compare(Car car, Car other) {
        return Integer.compare(car.getPrice(), other.getPrice());
    }
}