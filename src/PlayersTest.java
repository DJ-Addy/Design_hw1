import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PlayersTest {
    private Videogame_players player;
    private String username;
    private String statName;
    private int statValue;
    private int expectedStatValue;

    public PlayersTest(String username, String statName, int statValue, int expectedStatValue) {
        this.username = username;
        this.statName = statName;
        this.statValue = statValue;
        this.expectedStatValue = expectedStatValue;
    }
    @Before
    public void setUp() {
        player = new Videogame_players(username);
    }

        @Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][] {
                    {"XxGamerxX", "kills", 10, 10},
                    {"Ninja", "deaths", 0, 0},
                    {"Banzea", "score", 100, 100},
                    {"Kim", "score", 0, 0}
            });
        }

        @Test
        public void testGetUsername() {
            assertEquals(username, player.getUsername());
        }

    @Test
    public void testSetAndGetStat() {
        player.setStat(statName, statValue);
        assertEquals(expectedStatValue, player.getStat(statName));
    }

    @Test
    public void testGetStatWithNonExistingStatName() {
        assertEquals(0, player.getStat("numberOfHotdogsEaten"));
    }

    @Test
    public void testIncreaseStat() {
        player.setStat(statName, statValue);
        player.increaseStat(statName, 50);
        assertEquals(expectedStatValue + 50, player.getStat(statName));
    }
}