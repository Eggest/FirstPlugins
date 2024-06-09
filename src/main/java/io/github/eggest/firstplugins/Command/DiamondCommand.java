package io.github.eggest.firstplugins.Command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class DiamondCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.getLocation().getWorld().dropItem(player.getLocation(), new ItemStack(Material.DIAMOND_BLOCK, 64)).setCustomName("§r§b块石钻");
        }
        return true;
    }
}
