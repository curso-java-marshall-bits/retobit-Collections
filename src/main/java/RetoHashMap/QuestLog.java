package RetoHashMap;

import java.util.HashMap;

public class QuestLog {
    private HashMap<String, Quest> quests;  // Mapa: ID → Quest

    // El constructor no hace falta modificarlo
    public QuestLog() {
        this.quests = new HashMap<>();
    }

    public void addQuest(Quest quest) {
          if (!quests.containsKey(quest.getId())){
              quests.put(quest.getId(), quest);
          }
    }

    public Quest getQuest(String questId) {

        return quests.get(questId) ; // Sustituye null por el valor que sea
    }

    public void completeQuest(String questId) {
        Quest q = quests.get(questId);
        if (q!=null){
            q.setCompleted(true);
        }
    }

    // Este getter no lo vamos a modificar
    public HashMap<String, Quest> getQuests() {
        return quests;
    }

}