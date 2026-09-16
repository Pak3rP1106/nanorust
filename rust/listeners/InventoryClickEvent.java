package nano.spook1998.rust.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickEventListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event == null) {
            return;
        }
        // Placeholder logic: GUI interaction handled elsewhere.
    }
}
