package lambdaoptional.club;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Club {

    // --- attributes ---------------------------------------------------------

    private List<Member> members;

    // --- constructors -------------------------------------------------------

    public Club() {
        members = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Member> getMembers() { return members; }

    // --- public methods -----------------------------------------------------

    public void addMember(Member member) {
        members.add(member);
    }

    public Optional<Member> findFirst(Predicate<Member> predicate) {
        for (Member member : members) {
            if (predicate.test(member)) {
                return Optional.of(member);
            }
        }
        return Optional.empty();
    }

    public Optional<Double> averageNumberOfSkills() {
        if (members.isEmpty()) {
            return Optional.empty();
        }
        return getAverageNumberOfSkills();
    }

    // --- private methods ----------------------------------------------------

    private Optional<Double> getAverageNumberOfSkills() {
        int sumOfSkills = 0;
        for (Member member : members) {
            sumOfSkills += member.getSkills().size();
        }
        return Optional.of(sumOfSkills / (double) members.size());
    }
}