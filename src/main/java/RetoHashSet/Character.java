package RetoHashSet;

import java.util.HashSet;

public abstract class Character {
    private HashSet<Skill> skills = new HashSet<>();

    public boolean learnSkill(Skill skill) {
        if (skills.contains(skill)){
            return false;
        } else {
            skills.add(skill);
            return true;
        }
    }

    public boolean hasSkill(Skill skill) {
        if (skills.contains(skill)){
            return true;
        } else {
            return false;
        }
    }
}