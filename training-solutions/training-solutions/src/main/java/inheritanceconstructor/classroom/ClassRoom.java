package inheritanceconstructor.classroom;

public class ClassRoom extends Room {

    // --- attributes ---------------------------------------------------------

    private Facility facility;

    // --- constructors -------------------------------------------------------

    public ClassRoom(String location, int capacity, Facility facility) {
        super(location, capacity);
        this.facility = facility;
    }

    // --- getters and setters ------------------------------------------------

    public Facility getFacility() { return facility; }

    // --- public methods -----------------------------------------------------

    public boolean isSuitable(Course course) {
        return
                this.getCapacity() >= course.getParticipants() &&
                facility == course.getFacilityNeeded();
    }
}
