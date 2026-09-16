package nano.spook1998.rust.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathEventListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        if (event == null) {
            return;
        }
        // Placeholder logic: death handling managed by the main Rust logic.
    }
}
