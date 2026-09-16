package nano.spook1998.rust.listeners;

import nano.spook1998.rust.data.Settings;
import nano.spook1998.rust.data.manager.UserManager;
import nano.spook1998.rust.object.Region;
import nano.spook1998.rust.object.Structural;
import nano.spook1998.rust.object.User;
import nano.spook1998.rust.object.utils.RegionUtil;
import nano.spook1998.rust.object.utils.StructuralUtil;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/**
 * Handles block-breaking rules for the 1.8.8 Bukkit API.
 *
 * <p>The original class was obfuscated and contained incomplete decompiler
 * output. This implementation keeps the observable rules that can be
 * recovered safely: allowed block filtering, region protection and structural
 * damage. It deliberately does not invent commands or message keys that are
 * unavailable from the source archive.</p>
 */
public final class BlockBreakEvent implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onBreak(org.bukkit.event.block.BlockBreakEvent event) {
        if (event == null || event.getPlayer() == null || event.getBlock() == null) {
            return;
        }

        Player player = event.getPlayer();
        Block block = event.getBlock();

        // The original plugin used a gold axe for a non-destructive action.
        if (player.getItemInHand() != null
                && player.getItemInHand().getType() == Material.GOLD_AXE) {
            event.setCancelled(true);
            return;
        }

        if (!isAllowedToBreak(block.getType())) {
            event.setCancelled(true);
            return;
        }

        User user = UserManager.getInstance().getOrCreate(player);
        Region region = findRegion(block);

        if (region != null && region.getOwner() != null
                && region.getOwner() != user
                && !region.getAllowedPlayers().contains(player.getName())) {
            event.setCancelled(true);
            return;
        }

        Structural structural = findStructural(block);
        if (structural == null) {
            return;
        }

        // Structures are protected outside raid mode. The event is cancelled
        // even when damage is not applied, matching the original protection
        // behavior.
        if (!Boolean.TRUE.equals(Settings.RAID)) {
            event.setCancelled(true);
            return;
        }

        structural.damage(Math.max(1, Settings.DAMAGE_TO_STRUCTURAL == null
                ? 1 : Settings.DAMAGE_TO_STRUCTURAL));
        event.setCancelled(true);

        if (!structural.isActive()) {
            StructuralUtil.removeStructural(structural);
        }
    }

    private boolean isAllowedToBreak(Material material) {
        return material != null
                && (Settings.ALLOWED_BREAK.isEmpty()
                || Settings.ALLOWED_BREAK.contains(material));
    }

    private Region findRegion(Block block) {
        for (Region region : RegionUtil.getRegions()) {
            if (region != null && region.contains(block.getLocation())) {
                return region;
            }
        }
        return null;
    }

    private Structural findStructural(Block block) {
        for (Structural structural : StructuralUtil.getStructures()) {
            if (structural == null || structural.getLocation() == null) {
                continue;
            }
            if (structural.getLocation().getBlock().equals(block)) {
                return structural;
            }
        }
        return null;
    }
}
