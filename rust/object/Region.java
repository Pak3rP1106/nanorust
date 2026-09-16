package nano.spook1998.rust.object;

import java.util.UUID;

public class OfflineUser {

    private UUID uuid;
    private String name;
    private long lastSeen;
    private int points;

    public OfflineUser() {
        this.lastSeen = System.currentTimeMillis();
    }

    public OfflineUser(UUID uuid, String name) {
        this.uuid = uuid;
        this.name = name;
        this.lastSeen = System.currentTimeMillis();
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

    public long getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(long lastSeen) {
        this.lastSeen = lastSeen;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
