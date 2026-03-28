package RetoHashSet;

import java.util.HashSet;

public abstract class Character {
    private HashSet<Skill> skills = new HashSet<>();

    public boolean learnSkill(Skill skill) {
        return skills.add(skill); // sustituye este boolean por el return real
    }

    public boolean hasSkill(Skill skill) {
        return skills.contains(skill);  // sustituye este boolean por el return real
    }
}