package RetoHashSet;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CharacterSkillTest {

    static class TestCharacter extends Character {
        public TestCharacter() {}
    }

    @Test
    @Order(1)
    @DisplayName("Aprender habilidad nueva retorna true")
    void testLearnNewSkill() {
        TestCharacter character = new TestCharacter();
        Skill slash = new Skill("Slash");
        assertTrue(character.learnSkill(slash),
                "❌ learnSkill() debe retornar true para habilidades nuevas");
    }

    @Test
    @Order(2)
    @DisplayName("Aprender habilidad duplicada retorna false")
    void testLearnDuplicateSkill() {
        TestCharacter character = new TestCharacter();
        Skill fireball = new Skill("Fireball");
        character.learnSkill(fireball);
        assertFalse(character.learnSkill(fireball),
                "❌ learnSkill() debe retornar false para habilidades duplicadas");
    }

    @Test
    @Order(3)
    @DisplayName("hasSkill() retorna true para habilidad aprendida")
    void testHasExistingSkill() {
        TestCharacter character = new TestCharacter();
        Skill aim = new Skill("Precision Shot");
        character.learnSkill(aim);
        assertTrue(character.hasSkill(aim),
                "❌ hasSkill() debe retornar true para habilidades aprendidas");
    }

    @Test
    @Order(4)
    @DisplayName("hasSkill() retorna false para habilidad no aprendida")
    void testHasNonExistingSkill() {
        TestCharacter character = new TestCharacter();
        assertFalse(character.hasSkill(new Skill("Curar")),
                "❌ hasSkill() debe retornar false para habilidades no aprendidas");
    }
}