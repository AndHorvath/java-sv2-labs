package introexceptionwritefiletestjunit5;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ElectricityMain {

    public static void main(String[] args) {
        Electricity electricity = new Electricity();

        String[] streetArray = { "Szt. István krt.", "Teréz krt.", "Erzsébet krt.", "József krt.", "Ferenc krt." };
        String pathString = "src/main/resources/electricity.txt";
        Path path = Paths.get(pathString);

        electricity.addStreets(streetArray);
        electricity.writeStreets(path);
    }
}