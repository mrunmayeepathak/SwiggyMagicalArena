import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import com.magicarena.controller.ArenaController;
import com.magicarena.model.Player;
import com.magicarena.service.GameService;


public class ArenaControllerTest {

    private Player playerA;
    private Player playerB;
    private GameService gameService;
    private ArenaController arenaController;

    @Before
    public void setUp() {
        playerA = mock(Player.class);
        playerB = mock(Player.class);
        gameService = mock(GameService.class);

        // Set up the ArenaController with mocks
        arenaController = new ArenaController(playerA, playerB);
        arenaController.setGameservice(gameService); // Assuming you have a setter for this

        // Players are alive at the start
        when(playerA.isAlive()).thenReturn(true, true, false); // Player A is alive first two checks, then dies
        when(playerB.isAlive()).thenReturn(true); // Player B is always alive
    }

    @Test
    public void testStartFightWherePlayerAWins() {
        arenaController.startfight();

        // Verify the gameService.performAttack was actually called
        verify(gameService, atLeastOnce()).performAttack(any(Player.class), any(Player.class));
        // You could also verify the exact sequence of attackers and defenders if necessary

        // Check the end game condition
        verify(playerA, atLeastOnce()).isAlive();
        verify(playerB, atLeastOnce()).isAlive();
    }
}
