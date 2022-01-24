package collectionsset;

import java.util.Objects;

public class RightAnswer {

    // --- attributes ---------------------------------------------------------

    private String player;

    // --- constructors -------------------------------------------------------

    public RightAnswer(String player) {
        this.player = player;
    }

    // --- getters and setters ------------------------------------------------

    public String getPlayer() { return player; }

    // --- public methods -----------------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RightAnswer that = (RightAnswer) o;
        return Objects.equals(player, that.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player);
    }
}