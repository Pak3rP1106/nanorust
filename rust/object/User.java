package nano.spook1998.rust.object;

import java.util.UUID;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class User {

    private UUID uuid;
    private String name;
    private Clan clan;
    private int points;
    private boolean online;
    private int kills;
    private int deaths;
    private int level;
    private Location lastLocation;
    private long lastSeen;

    public User() {
    }

    public User(UUID uuid, String name) {
        this.uuid = uuid;
        this.name = name;
        this.points = 0;
        this.online = false;
        this.lastSeen = System.currentTimeMillis();
    }

    public User(Player player) {
        this(player.getUniqueId(), player.getName());
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Location getLastLocation() {
        return lastLocation;
    }

    public void setLastLocation(Location lastLocation) {
        this.lastLocation = lastLocation;
    }

    public long getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(long lastSeen) {
        this.lastSeen = lastSeen;
    }
}
