package RetoHashMap;
import java.util.HashMap;

public class QuestLog {
    private HashMap<String, Quest> quests;  // Mapa: ID → Quest

    public QuestLog() {
        this.quests = new HashMap<>();
    }

    // Añade una misión al registro
    public void addQuest(Quest quest) {

    }

    // Busca una misión por ID (retorna null si no existe)
    public Quest getQuest(String questId) {

        return null;
    }

    // Marca una misión como completada (si existe)
    public void completeQuest(String questId) {

    }
}