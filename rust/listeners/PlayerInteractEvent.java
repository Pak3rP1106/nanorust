package nano.spook1998.rust.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractEventListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        if (event == null) {
            return;
        }
        // Placeholder logic: interaction handling managed by the main Rust logic.
    }
}
