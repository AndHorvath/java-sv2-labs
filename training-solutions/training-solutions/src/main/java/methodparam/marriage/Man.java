package methodparam.marriage;

import java.util.List;

public class Man {

    // --- attributes ---------------------------------------------------------

    private String name;
    private List<RegisterDate> registerDates;

    // --- constructors -------------------------------------------------------

    public Man(String name, List<RegisterDate> registerDates) {
        this.name = name;
        this.registerDates = registerDates;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }

    public List<RegisterDate> getRegisterDates() { return registerDates; }

    // --- public methods -----------------------------------------------------

    public void addRegisterDate(RegisterDate registerDate) {
        registerDates.add(registerDate);
    }
}