package methodstructure.pendrives;

import java.util.List;

public class PenDrives {

    public PenDrive getBest(List<PenDrive> penDrives) {
        PenDrive actualBest = null;
        for (PenDrive penDrive : penDrives) {
            if (actualBest == null || actualBest.comparePricePerCapacity(penDrive) == 1) {
                actualBest = penDrive;
            }
        }
        return actualBest;
    }

    public PenDrive getCheapest(List<PenDrive> penDrives) {
        PenDrive actualCheapest = null;
        for (PenDrive penDrive : penDrives) {
            if (actualCheapest == null || penDrive.isCheaperThan(actualCheapest)) {
                actualCheapest = penDrive;
            }
        }
        return actualCheapest;
    }

    public void risePriceWhereCapacity(List<PenDrive> penDrives, int percent, int capacity) {
        for (PenDrive penDrive : penDrives) {
            if (penDrive.getCapacity() == capacity) {
                penDrive.risePrice(percent);
            }
        }
    }
}