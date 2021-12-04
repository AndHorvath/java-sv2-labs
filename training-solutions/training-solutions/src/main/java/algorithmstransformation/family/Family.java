package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {

    // --- attributes ---------------------------------------------------------

    private List<FamilyMember> familyMembers;

    // --- constructors -------------------------------------------------------

    public Family() {
        familyMembers = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<FamilyMember> getFamilyMembers() { return familyMembers; }

    // --- public methods -----------------------------------------------------

    public void addFamilyMember(FamilyMember familyMember) {
        familyMembers.add(familyMember);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String givenName) {
        List<Integer> agesOfRelevantMembers = new ArrayList<>();
        for (FamilyMember member : familyMembers) {
            if (member.getName().contains(givenName.concat(" "))) {
                agesOfRelevantMembers.add(member.getAge());
            }
        }
        return agesOfRelevantMembers;
    }
}