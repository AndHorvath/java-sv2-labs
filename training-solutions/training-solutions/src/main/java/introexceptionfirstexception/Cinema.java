package introexceptionfirstexception;

public class Cinema {

    // --- attributes ---------------------------------------------------------

    private String customer;
    private String movie;
    private String numberOfTickets;
    private String rowNumber;

    // --- constructors -------------------------------------------------------

    public Cinema(String customer, String movie, String numberOfTickets, String rowNumber) {
        this.customer = customer;
        this.movie = movie;
        this.numberOfTickets = numberOfTickets;
        this.rowNumber = rowNumber;
    }

    // --- getters and setters ------------------------------------------------

    public String getCustomer() { return customer; }
    public String getMovie() { return movie; }
    public String getNumberOfTickets() { return numberOfTickets; }
    public String getRowNumber() { return rowNumber; }

    // --- public methods -----------------------------------------------------

    public String getOrderToPrint() {
        StringBuilder orderToPrint = new StringBuilder();

        orderToPrint.append("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:\n");
        orderToPrint.append("Vásárló neve: ").append(customer).append("\n");
        orderToPrint.append("Film címe: ").append(movie).append("\n");
        orderToPrint.append(getRowAndSeats()).append("\n");
        orderToPrint.append("Jó szórakozást!");

        return orderToPrint.toString();
    }

    // --- private methods ----------------------------------------------------

    private String getRowAndSeats() {
        StringBuilder rowAndSeats = new StringBuilder("Lefoglalt helyek: ");
        int numberOfTicketsInteger = Integer.parseInt(numberOfTickets);
        int rowNumberInteger = Integer.parseInt(rowNumber);

        for (int i = 1; i <= numberOfTicketsInteger; i++) {
            rowAndSeats.append(rowNumberInteger).append(". sor ").append(i).append(". szék, ");
        }
        rowAndSeats.delete(rowAndSeats.length() - 2, rowAndSeats.length());

        return rowAndSeats.toString();
    }
}