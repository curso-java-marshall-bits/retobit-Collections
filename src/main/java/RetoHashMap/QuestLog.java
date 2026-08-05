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
        quests.put(quest.getId(), quest);
    }

    public Quest getQuest(String questId) {
        // Aquí tu código
        return quests.get(questId); // Si existe el objeto lo duvuelve si no, devuelve un null

/*        if (quests.containsKey(questId)){
            return quests.get(questId);
        } else {
        return null;
        }*/
        // return quests.getOrDefault(questId, null);
    }
    public void completeQuest(String questId) {
        // Aquí tu código
        Quest quest = quests.get(questId);
        if(quest !=null) {
            quest.setCompleted(true);
        }
        /*if(quests.containsKey(questId)){
            quests.get(questId).setCompleted(true);
        }*/
    }

    // Este getter no lo vamos a modificar
    public HashMap<String, Quest> getQuests() {
        return quests;
    }

}