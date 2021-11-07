package stringbasic;

public class Student {

    // --- attributes ---------------------------------------------------------

    private Person person;
    private String neptunCode;
    private String educationId;
    private String accessCard;

    // --- constructors -------------------------------------------------------

    public Student(Person person, String neptunCode, String educationId) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.educationId = educationId;
    }

    // --- getters and setters ------------------------------------------------

    public Person getPerson() { return person; }
    public void setPerson(Person person) { this.person = person; }

    public String getNeptunCode() { return neptunCode; }
    public void setNeptunCode(String neptunCode) { this.neptunCode = neptunCode; }

    public String getEducationId() { return educationId; }
    public void setEducationId(String educationId) { this.educationId = educationId; }

    public String getAccessCard() { return accessCard; }
    public void setAccessCard(String accessCard) { this.accessCard = accessCard; }
}