package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {

    public List<String> listBoys(String path) {
        try {
            return Files.readAllLines(Paths.get(path));
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file.", exception);
        }
    }

    public void handleBoysList(List<String> boysList) {
        for (String boy : boysList) {
            if ("Nemecsek Ernő".equals(boy)) {
                System.out.println(boy.toLowerCase());
            } else {
                System.out.println(boy);
            }
        }
    }
}