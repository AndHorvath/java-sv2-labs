package interfacerules.bill;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.*;

class ComplexBillWriterTest {

    ComplexBillWriter complexBillWriter;
    Bill bill;
    Path path;
    Path pathInvalid;
    Path pathNonExistent;
    IllegalStateException stateException;
    IllegalArgumentException argumentException;

    @BeforeEach
    void setUp() {
        complexBillWriter = new ComplexBillWriter();
        bill = new Bill();
        path = Paths.get("src/test/resources/billitems.txt");
        pathNonExistent = Paths.get("src/test/resources/billitems_.txt");
        pathInvalid = Paths.get("src/test/resources/billitemsinvalid.txt");
    }

    @Test
    void writeBillTest() {
        String result =
            "kenyér; darabszám: 1, egységár: 400, összesen: 400 Ft\n" +
            "tej; darabszám: 2, egységár: 300, összesen: 600 Ft\n" +
            "tejföl; darabszám: 2, egységár: 180, összesen: 360 Ft\n" +
            "fogkefe; darabszám: 5, egységár: 200, összesen: 1000 Ft";
        assertEquals(result, complexBillWriter.writeBill(bill.readBillItemsFromFile(path)));

        stateException = assertThrows(
            IllegalStateException.class,
            () -> complexBillWriter.writeBill(bill.readBillItemsFromFile(pathNonExistent)));
        assertEquals("Cannot read file.", stateException.getMessage());

        argumentException = assertThrows(
            IllegalArgumentException.class,
            () -> complexBillWriter.writeBill(bill.readBillItemsFromFile(pathInvalid)));
        assertEquals("Invalid number format.", argumentException.getMessage());
    }
}