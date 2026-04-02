package RetoHashMap;

import java.util.HashMap;

public class QuestLog {
    private HashMap<String, Quest> quests;  // Mapa: ID → Quest

    // El constructor no hace falta modificarlo
    public QuestLog() {
        this.quests = new HashMap<>();
    }

    public void addQuest(Quest quest) {
        Quest questFind = getQuest(quest.getId());
        if (questFind == null) {
            this.quests.put(quest.getId(), quest);
        }
    }

    public Quest getQuest(String questId) {
        return this.quests.get(questId);
    }

    public void completeQuest(String questId) {
        Quest questFind = getQuest(questId);
        if (questFind != null) {
            questFind.setCompleted(true);
            this.quests.put(questId, questFind);
        }
    }

    // Este getter no lo vamos a modificar
    public HashMap<String, Quest> getQuests() {
        return quests;
    }

}