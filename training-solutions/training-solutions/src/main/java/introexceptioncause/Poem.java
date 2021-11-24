package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Poem {

    public List<String> readPoem(String path) {
        try {
            return Files.readAllLines(Paths.get(path));
        } catch (IOException exception) {
            throw new IllegalStateException("Cannot read file", exception);
        }
    }
}