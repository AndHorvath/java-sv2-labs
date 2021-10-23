package conventions;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car("Volvo S40", "2.0 petrol", 4, 5);

        System.out.println("The car' parameters:");
        System.out.println("Type: " + car.getCarType());
        System.out.println("Engine: " + car.getEngineType());
        System.out.println("Number of doors: " + car.getDoors());
        System.out.println("Persons allowed: " + car.getPersons());

        System.out.println("Now, the model also will be specified.");

        car.addModelName("T5");

        System.out.println("Type: " + car.getCarType());
    }
}