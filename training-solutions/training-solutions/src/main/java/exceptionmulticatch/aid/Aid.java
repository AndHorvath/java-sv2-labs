package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    // --- attributes ---------------------------------------------------------

    private int amount;
    private static final String SEPARATOR = ": ";

    // --- constructors -------------------------------------------------------

    public Aid(int amount) {
        this.amount = amount;
    }

    // --- getters and setters ------------------------------------------------

    public int getAmount() { return amount; }

    // --- public methods -----------------------------------------------------

    public List<String> countAmountsOfAid(Path path) {
        List<String> amountsOfAid = new ArrayList<>();
        try {
            for (String line : Files.readAllLines(path)) {
                amountsOfAid.add(getSettlement(line).concat(SEPARATOR).concat(getAmountPerPerson(line)));
            }
            return amountsOfAid;
        } catch (NullPointerException | IOException | ArrayIndexOutOfBoundsException |
            NumberFormatException | ArithmeticException exception) {

            throw new IllegalStateException("Something went wrong while counting.", exception);
        }
    }

    // --- private methods ----------------------------------------------------

    private String getSettlement(String line) {
        return line.split(SEPARATOR)[0];
    }

    private String getAmountPerPerson(String line) {
        return Integer.toString(amount / Integer.parseInt(line.split(SEPARATOR)[1]));
    }
}