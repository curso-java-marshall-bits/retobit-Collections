package RetoHashSet;

import java.util.HashSet;

public abstract class Character {
    private HashSet<Skill> skills = new HashSet<>();

    public boolean learnSkill(Skill skill) {
        // Aquí tu código
        return skills.add(skill);
    }

    public boolean hasSkill(Skill skill) {
        // Aquí tu códigos
        return skills.contains(skill);
    }
}