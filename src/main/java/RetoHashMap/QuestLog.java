package RetoHashMap;

import java.util.HashMap;

public class QuestLog {
    private HashMap<String, Quest> quests;  // Mapa: ID → Quest

    public QuestLog() {
        this.quests = new HashMap<>();
    }

    public void addQuest(Quest quest) {
        quests.putIfAbsent(quest.getId(), quest);
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

    public HashMap<String, Quest> getQuests() {
        return quests;
    }

}