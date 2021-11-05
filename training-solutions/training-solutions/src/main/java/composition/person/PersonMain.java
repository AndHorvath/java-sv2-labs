package composition.person;

public class PersonMain {

    public static void main(String[] args) {
        Person person;
        Address oldAddress;
        Address newAddress;

        oldAddress = new Address("England", "London", "Main Street 15", "31211");
        System.out.println(oldAddress.addressToString());
        oldAddress.correctData(oldAddress.getCountry(), oldAddress.getCity(), "Main Street 150", "312141");
        System.out.println(oldAddress.addressToString());

        person = new Person("Jeremy Doe", "1234-ABC-5678");
        System.out.println(person.personToString());
        person.correctData(person.getName(), person.getIdentificationCard(), oldAddress);
        System.out.println(person.personToString());

        newAddress = new Address("England", "London", "Central Road 10", "112871");
        person.moveTo(newAddress);
        System.out.println(person.personToString());

        System.out.println(person.getAddress().getStreetAndNumber());
        System.out.println(person.getAddress().getZipCode());
    }
}