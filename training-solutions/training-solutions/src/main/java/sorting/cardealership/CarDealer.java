package sorting.cardealership;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {

    // --- attributes ---------------------------------------------------------

    private List<Car> cars;

    // --- constructors -------------------------------------------------------

    public CarDealer(List<Car> cars) {
        this.cars = cars;
    }

    // --- getters and setters ------------------------------------------------

    public List<Car> getCars() { return cars; }

    // --- public methods -----------------------------------------------------

    public List<Car> getCarsInConstructionOrder() {
        List<Car> auxCars = new ArrayList<>(cars);
        auxCars.sort(new CarConstructionComparator());
        return auxCars;
    }

    public List<Car> getCarsInPriceOrder() {
        List<Car> auxCars = new ArrayList<>(cars);
        auxCars.sort(new CarPriceComparator());
        return auxCars;
    }
}