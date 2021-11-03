package introconstructors;

import java.time.LocalDate;

public class CyclingTourMain {

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour(
                "Cycling around the lake", LocalDate.of(2021, 12,10));

        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartDate());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());

        cyclingTour.registerPersons(5);
        cyclingTour.ride(50.5);

        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartDate());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());
    }
}