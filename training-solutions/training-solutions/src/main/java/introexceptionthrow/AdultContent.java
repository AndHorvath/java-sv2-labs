package introexceptionthrow;

public class AdultContent {

    public static void main(String[] args) {
        String nameA = "John Doe";
        String nameB = "Jack Doe";
        int ageA = 25;
        int ageB = 17;

        Adult adultA = new Adult(nameA, ageA);
        System.out.println(adultA.getName());
        System.out.println(adultA.getAge());

        Adult adultB = new Adult(nameB, ageB);
        System.out.println(adultB.getName());
        System.out.println(adultB.getAge());
    }
}