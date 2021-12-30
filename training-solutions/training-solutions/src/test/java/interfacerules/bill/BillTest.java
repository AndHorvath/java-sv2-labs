package interfacerules.bill;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {

    Bill bill;
    Path path;
    Path pathNonExistent;
    IllegalStateException exception;

    @BeforeEach
    void setUp() {
        bill = new Bill();
        path = Paths.get("src/test/resources/billitems.txt");
        pathNonExistent = Paths.get("src/test/resources/billitems_.txt");
    }

    @Test
    void readBillItemsFromFileTest() {
        List<String> actualList = bill.readBillItemsFromFile(path);

        assertEquals(4, actualList.size());
        assertEquals("tejföl;180;2", actualList.get(2));

        exception = assertThrows(IllegalStateException.class, () -> bill.readBillItemsFromFile(pathNonExistent));
        assertEquals("Cannot read file.", exception.getMessage());
    }
}