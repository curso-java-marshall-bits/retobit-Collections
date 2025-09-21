package RetoHashMap;

import java.util.HashMap;

public class QuestLog {
    private HashMap<String, Quest> quests;  // Mapa: ID → Quest

    // El constructor no hace falta modificarlo
    public QuestLog() {
        this.quests = new HashMap<>();
    }

    public void addQuest(Quest quest) {
        if (quests.containsKey(quest.getId())){
            return;
        } else {
            quests.put(quest.getId(), quest);
        }
    }

    public Quest getQuest(String questId) {
        if (quests.containsKey(questId)){
            return quests.get(questId);
        } else {
            return null;
        }
    }

    public void completeQuest(String questId) {
        if (quests.containsKey(questId)){
            quests.get(questId).setCompleted(true);
        } else {
            return;
        }
    }

    // Este getter no lo vamos a modificar
    public HashMap<String, Quest> getQuests() {
        return quests;
    }

}