package localvariables;

public class DistanceMain {

    public static void main(String[] args) {
        Distance distance = new Distance();

        System.out.println("Distance: " + distance.getDistanceInKm());
        System.out.println("Exact: " + distance.isExact());

        int integerPartOfDistance = (int) distance.getDistanceInKm();

        System.out.println("The largest whole number less than or equal to the distance: " + integerPartOfDistance);
    }
}