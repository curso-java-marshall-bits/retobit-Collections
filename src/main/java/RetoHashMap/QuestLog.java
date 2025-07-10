package RetoHashMap;

import java.util.HashMap;

public class QuestLog {
    private HashMap<String, Quest> quests;  // Mapa: ID → Quest

    // El constructor no hace falta modificarlo
    public QuestLog() {
        this.quests = new HashMap<>();
    }

    public void addQuest(Quest quest) {
        quests.put(quest.getId(), quest);
    }

    public Quest getQuest(String questId) {
        return quests.get(questId);
    }

    public void completeQuest(String questId) {
        Quest quest = quests.get(questId);
        if (quest != null) {
            quest.setCompleted(true);
        }
    }

    // Este getter no lo vamos a modificar
    public HashMap<String, Quest> getQuests() {
        return quests;
    }

}