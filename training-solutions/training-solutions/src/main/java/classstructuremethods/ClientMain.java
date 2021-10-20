package classstructuremethods;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        ClientDataPrinter clientDataPrinter = new ClientDataPrinter();
        String relocationAddress;

        client.setName("Jim Doe");
        client.setYearOfBirth(2000);
        client.setAddress("123 Main St, Anytown, USA");

        clientDataPrinter.printClientData(client);

        System.out.println("Please, enter the client's new address!");
        relocationAddress = scanner.nextLine();
        client.migrate(relocationAddress);

        clientDataPrinter.printClientData(client);
    }
}
