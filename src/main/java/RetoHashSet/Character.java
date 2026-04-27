package RetoHashSet;

import java.util.HashSet;

public abstract class Character {
    private HashSet<Skill> skills = new HashSet<>();

    public boolean learnSkill(Skill skill) {
        if (skills.add(skill)) {
            return true;
        } else {
            return false;
        }
    }


    public boolean hasSkill(Skill skill) {
        boolean hasSkill = skills.contains(skill);
        if (hasSkill ){
            return true;
        } else {
            return false;
        }
    }
}