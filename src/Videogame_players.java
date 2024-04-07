import java.util.HashMap;
import java.util.*;

public class Videogame_players {
    private String username;
    private Map<String, Integer> stats;

    public Videogame_players(String username) {
        this.username = username;
        this.stats = new HashMap<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setStat(String statName, int value) {
        stats.put(statName, value);
    }

    public int getStat(String statName) {
        return stats.getOrDefault(statName, 0);
    }

    // Increase the value of the stat by the given amount
    public void increaseStat(String statName, int amount) {
        int currentValue = stats.getOrDefault(statName, 0);
        stats.put(statName, currentValue + amount);
    }
}