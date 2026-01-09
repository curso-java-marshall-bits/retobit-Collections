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
        this.quests.put(quest.getId(), quest);

    }

    public Quest getQuest(String questId) {
        // Aquí tu código
        return this.quests.get(questId);
    }

    public void completeQuest(String questId) {
        // Aquí tu código
        Quest quest = this.getQuest(questId);
        if (quest != null) {
            quest.setCompleted(true);
        }
    }

    // Este getter no lo vamos a modificar
    public HashMap<String, Quest> getQuests() {
        return quests;
    }

}