package nano.spook1998.rust.object;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Location;

public class Schemat {

    private String id;
    private String name;
    private String worldName;
    private final List<Location> blocks = new ArrayList<>();
    private boolean enabled = true;

    public Schemat() {
    }

    public Schemat(String id, String name) {
        this.id = id;
        this.name = name;
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

    public String getWorldName() {
        return worldName;
    }

    public void setWorldName(String worldName) {
        this.worldName = worldName;
    }

    public List<Location> getBlocks() {
        return blocks;
    }

    public void addBlock(Location location) {
        if (location != null && !blocks.contains(location)) {
            blocks.add(location);
        }
    }

    public void removeBlock(Location location) {
        blocks.remove(location);
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
