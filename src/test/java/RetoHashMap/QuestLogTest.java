package RetoHashMap;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class QuestLogTest {

    @Test
    @Order(1)
    @DisplayName("HashMap: Añadir misión permite recuperarla por ID")
    void testAddAndGetQuest() {
        QuestLog log = new QuestLog();
        Quest q = new Quest("MQ1", "Derrotar al Rey Demonio");
        log.addQuest(q);
        assertEquals(q, log.getQuest("MQ1"),
                "❌ getQuest() debe retornar la misión añadida con el mismo ID");
    }

    @Test
    @Order(2)
    @DisplayName("HashMap: Recuperar misión inexistente retorna null")
    void testGetNonExistingQuest() {
        QuestLog log = new QuestLog();
        assertNull(log.getQuest("UNKNOWN"),
                "❌ getQuest() debe retornar null para IDs no existentes");
    }

    @Test
    @Order(3)
    @DisplayName("HashMap: Completar misión existente actualiza su estado")
    void testCompleteExistingQuest() {
        QuestLog log = new QuestLog();
        Quest q = new Quest("SQ3", "Recoger 10 hierbas");
        log.addQuest(q);
        log.completeQuest("SQ3");
        assertTrue(q.isCompleted(),
                "❌ completeQuest() debe marcar la misión como completada");
    }

    @Test
    @Order(4)
    @DisplayName("HashMap: Completar misión inexistente no lanza excepción")
    void testCompleteNonExistingQuest() {
        QuestLog log = new QuestLog();
        assertDoesNotThrow(() -> log.completeQuest("INVALID_ID"),
                "❌ completeQuest() no debe lanzar excepciones para IDs inválidos");
    }
}