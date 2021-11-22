package introexceptionthrowjunit5;

import java.util.ArrayList;
import java.util.List;

public class Student {

    // --- attributes ---------------------------------------------------------

    private List<Integer> notes;

    // --- constructors -------------------------------------------------------

    public Student() {
        notes = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Integer> getNotes() { return notes; }

    // --- public methods -----------------------------------------------------

    public void addNote(int note) {
        if (isNoteValid(note)) {
            notes.add(note);
        } else {
            throw new IllegalArgumentException("Note must be between 1 and 5!");
        }
    }

    // --- private methods ----------------------------------------------------

    private boolean isNoteValid(int note) {
        return 1 <= note && note <= 5;
    }
}