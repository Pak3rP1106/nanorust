package nano.spook1998.rust.object;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Crafting {

    private String id;
    private String name;
    private ItemStack result;
    private final Map<Material, Integer> requirements = new HashMap<>();

    public Crafting() {
    }

    public Crafting(String id, String name, ItemStack result) {
        this.id = id;
        this.name = name;
        this.result = result;
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

    public ItemStack getResult() {
        return result;
    }

    public void setResult(ItemStack result) {
        this.result = result;
    }

    public Map<Material, Integer> getRequirements() {
        return requirements;
    }

    public void addRequirement(Material material, int amount) {
        if (material == null || amount <= 0) {
            return;
        }
        requirements.put(material, amount);
    }

    public void removeRequirement(Material material) {
        requirements.remove(material);
    }

    public boolean hasRequirement(Material material) {
        return requirements.containsKey(material);
    }
}
