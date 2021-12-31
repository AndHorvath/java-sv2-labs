package interfacedependencyinversion.shipping;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxDataPrinterTest {

    BoxDataPrinter boxDataPrinter;
    List<Box> boxes;

    @BeforeEach
    void setUp() {
        boxes = new ArrayList<>(Arrays.asList(
            new SmallBox(), new MediumBox(), new LargeBox(), new ExtraLargeBox()
        ));
        boxDataPrinter = new BoxDataPrinter(boxes);
    }

    @Test
    void getBoxesTest() {
        assertEquals(boxes, boxDataPrinter.getBoxes());
    }
}