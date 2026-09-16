package nano.spook1998.rust.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakEventListener implements Listener {

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        if (event == null) {
            return;
        }
        // Placeholder logic: block break validation handled elsewhere.
    }
}
