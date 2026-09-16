package nano.spook1998.rust.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinEventListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        if (event == null) {
            return;
        }
        // Placeholder logic: login / session initialization handled elsewhere.
    }
}
