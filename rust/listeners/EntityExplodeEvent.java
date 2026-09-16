package nano.spook1998.rust.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class EntityExplodeEventListener implements Listener {

    @EventHandler
    public void onExplode(EntityExplodeEvent event) {
        if (event == null) {
            return;
        }
        // Placeholder logic: explosion protection handled elsewhere.
    }
}
