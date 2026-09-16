package nano.spook1998.rust.object;

import org.bukkit.Location;
import org.bukkit.Material;

public class Structural {

    private String id;
    private String type;
    private Location location;
    private Material material;
    private int health;
    private int maxHealth;
    private boolean active = true;

    public Structural() {
    }

    public Structural(String id, String type, Location location, Material material, int maxHealth) {
        this.id = id;
        this.type = type;
        this.location = location;
        this.material = material;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void damage(int amount) {
        this.health = Math.max(0, this.health - amount);
        if (this.health == 0) {
            this.active = false;
        }
    }

    public void repair(int amount) {
        this.health = Math.min(maxHealth, this.health + amount);
        this.active = this.health > 0;
    }
}
