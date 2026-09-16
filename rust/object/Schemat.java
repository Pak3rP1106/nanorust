package nano.spook1998.rust.object;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class Gui implements InventoryHolder {

    private String id;
    private String title;
    private int rows;
    private Inventory inventory;
    private final Map<Integer, ItemStack> items = new HashMap<>();

    public Gui() {
        this.rows = 3;
        this.inventory = Bukkit.createInventory(this, rows * 9, title == null ? "GUI" : title);
    }

    public Gui(String id, String title, int rows) {
        this.id = id;
        this.title = title;
        this.rows = Math.max(1, rows);
        this.inventory = Bukkit.createInventory(this, this.rows * 9, title == null ? "GUI" : title);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        rebuildInventory();
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = Math.max(1, rows);
        rebuildInventory();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Map<Integer, ItemStack> getItems() {
        return items;
    }

    public void addItem(int slot, ItemStack item) {
        if (item == null) {
            return;
        }
        if (slot < 0 || slot >= inventory.getSize()) {
            return;
        }
        items.put(slot, item);
        inventory.setItem(slot, item);
    }

    public void removeItem(int slot) {
        items.remove(slot);
        inventory.clear(slot);
    }

    public void rebuildInventory() {
        if (inventory != null) {
            inventory.clear();
        }
        inventory = Bukkit.createInventory(this, rows * 9, title == null ? "GUI" : title);
        for (Map.Entry<Integer, ItemStack> entry : items.entrySet()) {
            inventory.setItem(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public Inventory getInventory(InventoryHolder holder) {
        return inventory;
    }
}
