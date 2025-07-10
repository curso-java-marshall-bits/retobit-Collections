package RetoHashSet;

import java.util.Objects;

public class Skill {
    private String name;

    public Skill(String name) {
        this.name = name;
    }

    // Equals y hashCode (¡clave para HashSet!)

    /**
     * Hacemos override del equals para evitar comparar solo por la referencia en memoria.
     * Compara este objeto Skill con otro para determinar si son "iguales".
     * Dos objetos Skill se consideran iguales si tienen el mismo nombre (ignorando mayúsculas/minúsculas).
     * Esto es crucial para que colecciones como HashSet funcionen correctamente,
     * ya que les permite identificar si un objeto ya existe y evitar duplicados.
     *
     * @param o El objeto con el que se va a comparar.
     * @return true si los objetos son iguales (tienen el mismo nombre), false en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        // Si es la misma instancia de objeto, son iguales.
        if (this == o) return true;
        // Si el objeto es nulo o de una clase diferente, no son iguales.
        if (o == null || getClass() != o.getClass()) return false;
        // Guardamos el objeto que nos llega en una variable. La casteamos para asegurarnos que es tipo Skill y tiene un name.
        Skill skill = (Skill) o;
        // retornamos la comparación de nombres y no de referencias en memoria.
        return Objects.equals(name, skill.name);
    }

    /**
     * Genera un valor de código hash para este objeto Skill.
     * Este method debe ser consistente con equals(): si dos objetos son iguales
     * según equals(), entonces su hashCode() debe ser el mismo.
     * Las colecciones basadas en hash (como HashSet o HashMap) lo usan para
     * almacenar y recuperar objetos de manera eficiente.
     * En este caso, el código hash se genera a partir del nombre de la habilidad.
     *
     * @return Un valor entero que representa el código hash del objeto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}