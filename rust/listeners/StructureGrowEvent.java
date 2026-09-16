package nano.spook1998.rust.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.StructureGrowEvent;

public class StructureGrowEventListener implements Listener {

    @EventHandler
    public void onGrow(StructureGrowEvent event) {
        if (event == null) {
            return;
        }
        // Placeholder logic: structure growth handled elsewhere.
    }
}
