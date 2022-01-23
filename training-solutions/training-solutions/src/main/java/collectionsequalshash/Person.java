package collectionsequalshash;

import java.util.Objects;

public class Person {

    // --- attributes ---------------------------------------------------------

    private String name;
    private int age;
    private String socialSecurityNumber;

    // --- constructors -------------------------------------------------------

    public Person(String name, int age, String socialSecurityNumber) {
        this.name = name;
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }

    // --- public methods -----------------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return socialSecurityNumber.equals(person.socialSecurityNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socialSecurityNumber);
    }

    // --- main method --------------------------------------------------------

    public static void main(String[] args) {
        Person personA = new Person("John Doe", 40, "ABC-123");
        Person personB = new Person("Jack Doe", 50, "ABC-123");

        System.out.println(personA.equals(personB));
        System.out.println(personA.hashCode());
        System.out.println(personB.hashCode());
    }
}