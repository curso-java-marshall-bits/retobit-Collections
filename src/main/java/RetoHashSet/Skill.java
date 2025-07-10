package RetoHashSet;

import java.util.Objects;

public class Skill {
    private String name;
    public Skill(String name) { this.name = name; }

    // Equals y hashCode (¡clave para HashSet!)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return Objects.equals(name, skill.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}