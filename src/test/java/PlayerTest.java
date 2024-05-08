
import static org.junit.Assert.*;

import com.magicarena.model.Player;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        // Initialize Player with some test data
        player = new Player(100, 10, 5, "PlayerA");
    }

    @Test
    public void testGetters() {
        assertEquals("Health should be initialized to 100", 100, player.getHealth());
        assertEquals("Strength should be initialized to 10", 10, player.getStrength());
        assertEquals("Attack should be initialized to 5", 5, player.getAttack());
        assertEquals("Player name should be 'PlayerA'", "PlayerA", player.getPlayerName());
    }

    @Test
    public void testSetters() {
        player.setHealth(90);
        assertEquals("Health should be set to 90", 90, player.getHealth());

        player.setStrength(15);
        assertEquals("Strength should be set to 15", 15, player.getStrength());

        player.setAttack(20);
        assertEquals("Attack should be set to 20", 20, player.getAttack());

        player.setPlayerName("PlayerB");
        assertEquals("Player name should be changed to PlayerB", "PlayerB", player.getPlayerName());
    }

    @Test
    public void testIsAlive() {
        assertTrue("Player should be alive with health > 0", player.isAlive());
        player.setHealth(0);
        assertFalse("Player should not be alive with health 0", player.isAlive());
        player.setHealth(-10);
        assertFalse("Player should not be alive with health < 0", player.isAlive());
    }
}
