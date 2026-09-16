package nano.spook1998.rust.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AsyncPlayerChatEventListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        if (event == null || event.getPlayer() == null) {
            return;
        }
        // Placeholder logic: chat is handled by the main Rust logic layer.
    }
}
