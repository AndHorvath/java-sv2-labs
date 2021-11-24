package introexceptioncause;

import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoysMain {

    public static void main(String[] args) {
        List<String> boysList = new ArrayList<>();
        String path = "src/main/resources/palutcaifiuk.txt";
        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();
        try {
            boysList = paulStreetBoys.listBoys(path);
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getCause().getMessage());
            exception.printStackTrace();
            exception.getCause().printStackTrace();
        }
        paulStreetBoys.handleBoysList(boysList);
    }
}