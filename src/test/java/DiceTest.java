
import static org.junit.Assert.*;

import com.magicarena.model.Dice;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testDiceRolls() {
        boolean rollsAreValid = true;
        int roll;

        // Test a large number of rolls to ensure statistical accuracy
        for (int i = 0; i < 1000; i++) {
            roll = Dice.roll();
            if (roll < 1 || roll > 6) {
                rollsAreValid = false;
                break;
            }
        }

        assertTrue("All dice rolls should be between 1 and 6", rollsAreValid);
    }
}
