package nano.spook1998.rust.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityDamageByEntityEventListener implements Listener {

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
        if (event == null) {
            return;
        }
        // Placeholder logic: combat and PvP rules handled elsewhere.
    }
}
