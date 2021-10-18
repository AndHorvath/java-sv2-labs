package classstructureattributes;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();

        client.name = "Jim Doe";
        client.yearOfBirth = 2000;
        client.address = "123 Main St, Anytown, USA";

        System.out.println("Client's name: " + client.name );
        System.out.println("Client's birth year: " + client.yearOfBirth);
        System.out.println("Client's address: " + client.address);
    }
}
