package interfacestaticmethods.vehicle;

public interface Vehicle {

    static Vehicle of(int numberOfWheels) {
        if (numberOfWheels == 2) {
            return new Bicycle(numberOfWheels);
        } else if (numberOfWheels == 4) {
            return new Car(numberOfWheels);
        } else {
            throw new IllegalArgumentException("Vehicle must have either 2 or 4 wheels.");
        }
    }
}