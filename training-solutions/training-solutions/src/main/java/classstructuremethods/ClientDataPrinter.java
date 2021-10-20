package classstructuremethods;

public class ClientDataPrinter {

    public void printClientData(Client client) {
        System.out.println("Client's name: " + client.getName() );
        System.out.println("Client's birth year: " + client.getYearOfBirth());
        System.out.println("Client's address: " + client.getAddress());
    }
}
