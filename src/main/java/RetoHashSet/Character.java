package RetoHashSet;
import java.util.HashSet;

public abstract class Character {
    private HashSet<Skill> skills = new HashSet<>();

    public boolean learnSkill(Skill skill) {
        return false;
    }

    public boolean hasSkill(Skill skill) {
        return false;
    }
}