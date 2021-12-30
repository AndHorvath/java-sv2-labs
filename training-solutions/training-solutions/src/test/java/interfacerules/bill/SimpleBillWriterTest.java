package interfacerules.bill;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.*;

class SimpleBillWriterTest {

    SimpleBillWriter simpleBillWriter;
    Bill bill;
    Path path;
    Path pathInvalid;
    Path pathNonExistent;
    IllegalStateException stateException;
    IllegalArgumentException argumentException;

    @BeforeEach
    void setUp() {
        simpleBillWriter = new SimpleBillWriter();
        bill = new Bill();
        path = Paths.get("src/test/resources/billitems.txt");
        pathNonExistent = Paths.get("src/test/resources/billitems_.txt");
        pathInvalid = Paths.get("src/test/resources/billitemsinvalid.txt");
    }

    @Test
    void writeBillTest() {
        String result =
            "kenyér, 1 * 400 = 400 Ft\n" +
            "tej, 2 * 300 = 600 Ft\n" +
            "tejföl, 2 * 180 = 360 Ft\n" +
            "fogkefe, 5 * 200 = 1000 Ft";
        assertEquals(result, simpleBillWriter.writeBill(bill.readBillItemsFromFile(path)));

        stateException = assertThrows(
            IllegalStateException.class,
            () -> simpleBillWriter.writeBill(bill.readBillItemsFromFile(pathNonExistent)));
        assertEquals("Cannot read file.", stateException.getMessage());

        argumentException = assertThrows(
            IllegalArgumentException.class,
            () -> simpleBillWriter.writeBill(bill.readBillItemsFromFile(pathInvalid)));
        assertEquals("Invalid number format.", argumentException.getMessage());
    }
}