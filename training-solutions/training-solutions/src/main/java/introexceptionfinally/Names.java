package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Names {

    public List<String> collectDrs(Path path) {
        List<String> drs = new ArrayList<>();
        for (String name : readNames(path)) {
            if ("dr.".equals(name.substring(0, 3))) {
                drs.add(name);
            }
        }
        return drs;
    }

    private List<String> readNames(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file.", exception);
        } finally {
            System.out.println("End of reading.");
        }
    }
}