package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {
        List<String> stops = Arrays.asList("Budapest", "Szolnok", "Debrecen");
        String pathString = "src/main/resources/roadmap.txt";
        try {
            Files.write(Paths.get(pathString), stops);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}