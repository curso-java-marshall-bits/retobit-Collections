package RetoHashSet;

import java.util.HashSet;

public abstract class Character {
    private HashSet<Skill> skills = new HashSet<>();

    public boolean learnSkill(Skill skill) {
        if(!skills.contains(skill)){
            skills.add(skill);
            return true;
        }
        return false; // sustituye este boolean por el return real
    }

    public boolean hasSkill(Skill skill) {
        if(skills.contains(skill)){

            return true;
        }

        return false;  // sustituye este boolean por el return real
    }
}