package RetoHashMap;

public class Quest {
    private String id;          // ID único (clave en el HashMap)
    private String description; // Descripción de la misión
    private boolean completed;  // Estado

    public Quest(String id, String description) {
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}