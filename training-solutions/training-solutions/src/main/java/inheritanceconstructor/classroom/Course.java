package inheritanceconstructor.classroom;

public class Course {

    // --- attributes ---------------------------------------------------------

    private int participants;
    private Facility facilityNeeded;

    // --- constructors -------------------------------------------------------

    public Course(int participants, Facility facilityNeeded) {
        this.participants = participants;
        this.facilityNeeded = facilityNeeded;
    }

    // --- getters and setters ------------------------------------------------

    public int getParticipants() { return participants; }
    public Facility getFacilityNeeded() { return facilityNeeded; }
}