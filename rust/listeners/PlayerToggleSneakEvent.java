package nano.spook1998.rust.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class PlayerToggleSneakEventListener implements Listener {

    @EventHandler
    public void onSneak(PlayerToggleSneakEvent event) {
        if (event == null) {
            return;
        }
        // Placeholder logic: sneaking behavior handled elsewhere.
    }
}
