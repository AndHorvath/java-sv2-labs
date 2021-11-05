package composition.realestate;

public class RealEstateDotCom {

    public static void main(String[] args) {
        Address address;
        Details details;
        RealEstate realEstate;

        address = new Address("London", "", "Central Road", 90);
        address.setZipCode("125713");
        System.out.println(address);

        details = new Details("", address, 100, 1000);
        details.setDescription("Very nice house!");
        System.out.println(details);

        realEstate = new RealEstate("", 100_000.0, details);
        realEstate.setTitle("Nice house!");
        System.out.println(realEstate);

        System.out.println(realEstate.getDetails().getAddress().getCity());
        System.out.println(realEstate.getDetails().getAddress().getStreet());
    }
}