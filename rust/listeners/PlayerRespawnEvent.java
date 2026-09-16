package nano.spook1998.rust.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class PlayerRespawnEventListener implements Listener {

    @EventHandler
    public void onRespawn(PlayerRespawnEvent event) {
        if (event == null) {
            return;
        }
        // Placeholder logic: respawn positioning handled elsewhere.
    }
}
