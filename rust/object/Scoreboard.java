package nano.spook1998.rust.object;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public class Scoreboard {

    private final String id;
    private final org.bukkit.scoreboard.Scoreboard scoreboard;
    private final Objective objective;
    private final Map<String, Integer> values = new HashMap<>();

    public Scoreboard(String id, String title) {
        this.id = id;
        this.scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        this.objective = this.scoreboard.registerNewObjective(id, "dummy");
        this.objective.setDisplayName(title == null ? "Rust" : title);
        this.objective.setDisplaySlot(DisplaySlot.SIDEBAR);
    }

    public String getId() {
        return id;
    }

    public Objective getObjective() {
        return objective;
    }

    public Scoreboard getScoreboard() {
        return this;
    }

    public org.bukkit.scoreboard.Scoreboard getHandle() {
        return scoreboard;
    }

    public void setLine(int slot, String text) {
        if (text == null || text.length() > 48) {
            return;
        }
        String key = "line_" + slot;
        values.put(key, slot);
        Score score = objective.getScore(Bukkit.getOfflinePlayer(text));
        score.setScore(slot);
    }

    public void update(Player player) {
        if (player == null) {
            return;
        }
        player.setScoreboard(scoreboard);
    }

    public void clear() {
        values.clear();
        for (String entry : scoreboard.getEntries()) {
            scoreboard.resetScores(entry);
        }
    }
}
