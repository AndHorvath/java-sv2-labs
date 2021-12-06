package methodparam.marriage;

import java.util.List;

public class Woman {

    // --- attributes ---------------------------------------------------------

    private String name;
    private List<RegisterDate> registerDates;

    // --- constructors -------------------------------------------------------

    public Woman(String name, List<RegisterDate> registerDates) {
        this.name = name;
        this.registerDates = registerDates;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<RegisterDate> getRegisterDates() { return registerDates; }

    // --- public methods -----------------------------------------------------

    public void addRegisterDate(RegisterDate registerDate) {
        registerDates.add(registerDate);
    }
}