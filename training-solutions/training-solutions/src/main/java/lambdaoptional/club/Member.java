package lambdaoptional.club;

import java.util.List;

public class Member {

    // --- attributes ---------------------------------------------------------

    private String name;
    private List<String> skills;
    private Gender gender;

    // --- constructors -------------------------------------------------------

    public Member(String name, List<String> skills, Gender gender) {
        this.name = name;
        this.skills = skills;
        this.gender = gender;
    }

    // --- getters and setters ------------------------------------------------

    public String getName() { return name; }
    public List<String> getSkills() { return skills; }
    public Gender getGender() { return gender; }
}