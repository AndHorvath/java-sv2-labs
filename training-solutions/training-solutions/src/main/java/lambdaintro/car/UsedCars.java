package lambdaintro.car;

import java.util.ArrayList;
import java.util.List;

public class UsedCars {

    // --- attributes ---------------------------------------------------------

    private List<Car> cars;

    // --- constructors -------------------------------------------------------

    public UsedCars() {
        cars = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Car> getCars() { return cars; }

    // --- public methods -----------------------------------------------------

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> listCarsByPrice() {
        List<Car> auxCars = new ArrayList<>(cars);
        auxCars.sort((car, other) -> Integer.compare(car.getPrice(), other.getPrice()));
        return auxCars;
    }

    public List<Car> listCarsByLengthDesc() {
        List<Car> auxCars = new ArrayList<>(cars);
        auxCars.sort((car, other) -> Double.compare(other.getLength(), car.getLength()));
        return auxCars;
    }

    public List<Car> listCarsOneBrandByType(String brand) {
        List<Car> carsOfBrand = getCarsOfBrand(brand);
        carsOfBrand.sort((car, other) -> car.getType().compareToIgnoreCase(other.getType()));
        return carsOfBrand;
    }

    // --- private methods ----------------------------------------------------

    private List<Car> getCarsOfBrand(String brand) {
        List<Car> carsOfBrand = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                carsOfBrand.add(car);
            }
        }
        return carsOfBrand;
    }
}