package compositionlist.computer;

public class PersonalComputerMain {

    public static void main(String[] args) {
        Cpu cpu = new Cpu("AMD", 3.4);
        Hardware firstHardware = new Hardware("RAM", "New RAM model");
        Hardware secondHardware = new Hardware("SSD", "New SSD model");
        Software firstSoftware = new Software("Windows", 10.1);
        Software secondSoftware = new Software("IntelliJ IDEA", 2.3);
        PersonalComputer personalComputer;

        personalComputer = new PersonalComputer(cpu);
        System.out.println(personalComputer);

        personalComputer.addHardware(firstHardware);
        personalComputer.addHardware(secondHardware);
        personalComputer.addSoftware(firstSoftware);
        personalComputer.addSoftware(secondSoftware);
        System.out.println(personalComputer);

        System.out.println(personalComputer.getHardwareList().get(0).getName());
        System.out.println(personalComputer.getSoftwareList().get(1).getNumberOfVersion());
    }
}