package interfacedependencyinversion.shipping;

import java.util.ArrayList;
import java.util.Arrays;

public class CourierCompany {

    public static void main(String[] args) {
        BoxDataPrinter boxDataPrinter = new BoxDataPrinter(
            new ArrayList<>(Arrays.asList(
                new SmallBox(), new MediumBox(), new LargeBox(), new ExtraLargeBox()
            ))
        );
        boxDataPrinter.printAllBoxesData();
    }
}