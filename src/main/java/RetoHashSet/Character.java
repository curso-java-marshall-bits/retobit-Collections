package RetoHashSet;

import java.util.HashSet;

public abstract class Character {
    private HashSet<Skill> skills = new HashSet<>();

    public boolean learnSkill(Skill skill) {
        if (hasSkill(skill)) return false;

        this.skills.add(skill);
        return true;
    }

    public boolean hasSkill(Skill skill) {
        return this.skills.contains(skill);
    }
}