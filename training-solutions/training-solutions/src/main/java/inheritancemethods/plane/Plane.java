package inheritancemethods.plane;

public class Plane {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("John Doe", 40_000);
        PriorityPassenger priorityPassenger = new PriorityPassenger("Jack Doe", 40_000, 25);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Jane Doe", 40_000, 25);

        System.out.println(passenger);
        System.out.println(priorityPassenger);
        System.out.println(firstClassPassenger);
    }
}