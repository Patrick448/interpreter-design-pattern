package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombatManagerTest {

    @Test
    void deveCausarDano(){
        Character character1 = new Character("Character1", 100, 100, 10, 5, 1, 2);
        Character character2 = new Character("Character2", 100, 10, 10, 5, 1, 2);

        CombatManager combatManager = CombatManager.getInstance();
        combatManager.applyDamage(character1, character2);

        assertEquals(95, character2.getLife());
    }
}