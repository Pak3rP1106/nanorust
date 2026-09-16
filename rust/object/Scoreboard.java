package nano.spook1998.rust.object;

import org.bukkit.Location;

public class StoneGenerator {

    private String id;
    private Location location;
    private int health;
    private int maxHealth;
    private boolean active = true;

    public StoneGenerator() {
    }

    public StoneGenerator(String id, Location location, int maxHealth) {
        this.id = id;
        this.location = location;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if (this.health <= 0) {
            this.active = false;
            this.health = 0;
        } else if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
        if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void damage(int amount) {
        if (amount <= 0) {
            return;
        }
        this.health = Math.max(0, this.health - amount);
        this.active = this.health > 0;
    }

    public void repair(int amount) {
        if (amount <= 0) {
            return;
        }
        this.health = Math.min(this.maxHealth, this.health + amount);
        this.active = this.health > 0;
    }
}
