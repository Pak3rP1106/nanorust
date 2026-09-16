package nano.spook1998.rust.object;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

public class AirDrop {

    private String id;
    private Location location;
    private ItemStack item;
    private int amount;
    private boolean active;
    private long createdAt;
    private final List<String> loot = new ArrayList<>();

    public AirDrop() {
        this.createdAt = System.currentTimeMillis();
    }

    public AirDrop(String id, Location location, ItemStack item, int amount) {
        this.id = id;
        this.location = location;
        this.item = item;
        this.amount = amount;
        this.active = true;
        this.createdAt = System.currentTimeMillis();
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

    public ItemStack getItem() {
        return item;
    }

    public void setItem(ItemStack item) {
        this.item = item;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public List<String> getLoot() {
        return loot;
    }

    public void addLoot(String entry) {
        if (entry != null && !loot.contains(entry)) {
            loot.add(entry);
        }
    }

    public void clearLoot() {
        loot.clear();
    }
}
