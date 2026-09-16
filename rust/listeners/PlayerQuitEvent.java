package nano.spook1998.rust.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitEventListener implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        if (event == null) {
            return;
        }
        // Placeholder logic: save / cleanup handled elsewhere.
    }
}
