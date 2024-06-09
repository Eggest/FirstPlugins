package io.github.eggest.firstplugins;


import io.github.eggest.firstplugins.CustomEvent.DiamondEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;

public class Listener implements org.bukkit.event.Listener {
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    void onBlockPlace(BlockPlaceEvent e) {
//        e.setCancelled(true);
    }

    @EventHandler
    public void DiamondEvent_Getdiamond(AsyncPlayerChatEvent e) {
        if (e.getMessage().equals("diamond")) {
            DiamondEvent event = new DiamondEvent(e.getPlayer());
            Bukkit.getServer().getPluginManager().callEvent(event);
            e.getPlayer().getLocation().getWorld().dropItem(e.getPlayer().getLocation(), new ItemStack(Material.DIAMOND_BLOCK, 64)).setCustomName("§r§b块石钻");
        }

    }
}
