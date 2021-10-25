package linebreak;

import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        String brand;
        String type;

        System.out.println("Please, enter the brand of the car!");
        brand = scanner.nextLine();
        System.out.println("Now, enter its type!");
        type = scanner.nextLine();

        System.out.print("Your entries are:\r\n" + car.getBrandAndTypeInSeparateLines(brand, type));
    }
}
