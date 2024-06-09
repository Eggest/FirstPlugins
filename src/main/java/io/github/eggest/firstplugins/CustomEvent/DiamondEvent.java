package io.github.eggest.firstplugins.CustomEvent;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;

public class DiamondEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private Player p;

    public DiamondEvent(Player p) {
        this.p = p;
    }

    public Player getPlayer() {
        return p;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void DiamondEvent_Getdiamond(AsyncPlayerChatEvent e) {
        if (e.getMessage().equals("diamond")) {
            DiamondEvent event = new DiamondEvent(e.getPlayer());
            Bukkit.getServer().getPluginManager().callEvent(event);
            e.getPlayer()
                    .getLocation()
                    .getWorld()
                    .dropItem(e.getPlayer().getLocation(),
                    new ItemStack(Material.DIAMOND_BLOCK, 64))
                    .setCustomName("§r§b块石钻");
        }

    }

}
