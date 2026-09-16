package nano.spook1998.rust.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlaceEventListener implements Listener {

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        if (event == null) {
            return;
        }
        // Placeholder logic: block placement validation handled elsewhere.
    }
}
