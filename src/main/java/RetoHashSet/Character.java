package RetoHashSet;

import java.util.HashSet;

public abstract class Character {

    private HashSet<Skill> skills = new HashSet<>();

    public boolean learnSkill(Skill skill) {
        // Aquí tu código
        return skills.add(skill); // devuelve true si el elemento añadido no se encuentra ya dentro del HashSet
/*        if (!skills.contains(skill)) {
            skills.add(skill);
            return true;
        } else {
            return false;
        }*/
    }

    public boolean hasSkill(Skill skill) {
        // Aquí tu código
            return skills.contains(skill); // Devuelve un true si esta contenido el objeto habiliidad
/*        if (skills.contains(skill)) {
            return true;
        } else {
            return false;
        }*/
    }
}