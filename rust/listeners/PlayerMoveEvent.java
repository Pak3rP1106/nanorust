package nano.spook1998.rust.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMoveEventListener implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        if (event == null) {
            return;
        }
        // Placeholder logic: movement restrictions handled elsewhere.
    }
}
