package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    // --- public methods -----------------------------------------------------

    public void getMarried(Woman woman, Man man) {
        setNameAfterMarriage(woman, man);
        addRegisterDateAfterMarriage(woman, man);
    }

    // --- private methods ----------------------------------------------------

    private void setNameAfterMarriage(Woman woman, Man man) {
        woman.setName(woman.getName().split(" ")[0] + " " + man.getName().split(" ")[1]);
    }

    private void addRegisterDateAfterMarriage(Woman woman, Man man) {
        woman.addRegisterDate(getRegisterDateAfterMarriage());
        man.addRegisterDate(getRegisterDateAfterMarriage());
    }

    private RegisterDate getRegisterDateAfterMarriage() {
        return new RegisterDate("házasságkötés ideje", LocalDate.now());
    }
}