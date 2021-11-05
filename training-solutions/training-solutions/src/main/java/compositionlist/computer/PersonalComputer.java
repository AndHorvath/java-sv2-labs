package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class PersonalComputer {

    // --- attributes ---------------------------------------------------------

    private final List<Hardware> hardwareList;
    private final List<Software> softwareList;
    private final Cpu cpu;

    // --- constructors -------------------------------------------------------

    public PersonalComputer(Cpu cpu) {
        this.cpu = cpu;
        this.hardwareList = new ArrayList<>();
        this.softwareList = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Hardware> getHardwareList() { return hardwareList; }

    public List<Software> getSoftwareList() { return softwareList; }

    public Cpu getCpu() { return cpu; }

    // --- public methods -----------------------------------------------------

    public void addHardware(Hardware hardware) {
        hardwareList.add(hardware);
    }

    public void addSoftware(Software software) {
        softwareList.add(software);
    }

    @Override
    public String toString() {
        return cpu + " " + hardwareList + " " + softwareList;
    }
}