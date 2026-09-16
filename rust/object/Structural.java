package nano.spook1998.rust.object;

import java.util.HashSet;
import java.util.Set;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class Region {

    private String id;
    private String name;
    private World world;
    private Location min;
    private Location max;
    private User owner;
    private boolean enabled = true;
    private final Set<String> allowedPlayers = new HashSet<>();

    public Region() {
    }

    public Region(String id, String name, Location min, Location max) {
        this.id = id;
        this.name = name;
        this.min = min;
        this.max = max;
        if (min != null && max != null) {
            this.world = min.getWorld() != null ? min.getWorld() : max.getWorld();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public Location getMin() {
        return min;
    }

    public void setMin(Location min) {
        this.min = min;
        if (this.world == null && min != null) {
            this.world = min.getWorld();
        }
    }

    public Location getMax() {
        return max;
    }

    public void setMax(Location max) {
        this.max = max;
        if (this.world == null && max != null) {
            this.world = max.getWorld();
        }
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Set<String> getAllowedPlayers() {
        return allowedPlayers;
    }

    public void addAllowedPlayer(String name) {
        if (name != null) {
            allowedPlayers.add(name);
        }
    }

    public void removeAllowedPlayer(String name) {
        allowedPlayers.remove(name);
    }

    public boolean contains(Location location) {
        if (location == null || min == null || max == null) {
            return false;
        }
        if (location.getWorld() == null || !location.getWorld().equals(world)) {
            return false;
        }

        double x1 = Math.min(min.getX(), max.getX());
        double x2 = Math.max(min.getX(), max.getX());
        double y1 = Math.min(min.getY(), max.getY());
        double y2 = Math.max(min.getY(), max.getY());
        double z1 = Math.min(min.getZ(), max.getZ());
        double z2 = Math.max(min.getZ(), max.getZ());

        return location.getX() >= x1 && location.getX() <= x2
            && location.getY() >= y1 && location.getY() <= y2
            && location.getZ() >= z1 && location.getZ() <= z2;
    }

    public boolean contains(Player player) {
        return player != null && contains(player.getLocation());
    }
}
