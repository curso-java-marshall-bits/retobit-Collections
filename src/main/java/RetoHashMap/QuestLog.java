package RetoHashMap;

import java.util.HashMap;

public class QuestLog {
    private HashMap<String, Quest> quests;  // Mapa: ID → Quest

    // El constructor no hace falta modificarlo
    public QuestLog() {
        this.quests = new HashMap<>();
    }

    public void addQuest(Quest quest) {
        // Aquí tu código
    }

    public Quest getQuest(String questId) {
        // Aquí tu código
        return null; // Sustituye null por el valor que sea
    }

    public void completeQuest(String questId) {
        // Aquí tu código
    }

    // Este getter no lo vamos a modificar
    public HashMap<String, Quest> getQuests() {
        return quests;
    }

}