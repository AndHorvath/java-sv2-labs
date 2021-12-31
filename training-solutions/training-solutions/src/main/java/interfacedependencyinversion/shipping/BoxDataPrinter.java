package interfacedependencyinversion.shipping;

import java.util.List;

public class BoxDataPrinter {

    // --- attributes ---------------------------------------------------------

    List<Box> boxes;

    // --- constructors -------------------------------------------------------

    public BoxDataPrinter(List<Box> boxes) {
        this.boxes = boxes;
    }

    // --- getters and setters ------------------------------------------------

    public List<Box> getBoxes() { return boxes; }

    // --- public methods -----------------------------------------------------

    public void printAllBoxesData() {
        for (Box box : boxes) {
            printBoxData(box);
        }
    }

    // --- private methods ----------------------------------------------------

    private void printBoxData(Box box) {
        System.out.println(box.getSize());
        System.out.println(box.getPrice());
    }
}