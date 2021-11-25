package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    Electricity electricity;
    String[] streetsToAdd;

    @TempDir
    File temporaryFolder;

    @BeforeEach
    void setUp() {
        electricity = new Electricity();
        electricity.addStreets(new String[] { "Default street" });
        streetsToAdd = new String[] { "Main street", "Central road" };
    }

    @Test
    void getDateAndStreetsTodayTest() {
        String expectedDate = LocalDate.now().toString();
        String expectedStreet = "Default street";
        assertEquals(expectedDate, electricity.getDateAndStreetsToday().get(0));
        assertEquals(expectedStreet, electricity.getDateAndStreetsToday().get(1));
    }

    @Test
    void addStreetsTest() {
        electricity.addStreets(streetsToAdd);
        List<String> expectedDateAndStreets = Arrays.asList(
                LocalDate.now().toString(), "Default street", "Main street", "Central road"
        );
        assertEquals(expectedDateAndStreets, electricity.getDateAndStreetsToday());
    }

    @Test
    void writeStreetsTest() throws IOException {
        Path path = temporaryFolder.toPath().resolve("elecricitytemp.txt");
        electricity.addStreets(streetsToAdd);
        electricity.writeStreets(path);

        List<String> dateAndStreets = Files.readAllLines(path);
        assertEquals(electricity.getDateAndStreetsToday(), dateAndStreets);

        System.out.println(path);
    }
}