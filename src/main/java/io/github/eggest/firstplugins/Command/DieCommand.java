package io.github.eggest.firstplugins.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DieCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("该指令只能由玩家执行！");
            return true;
        }
        Player player = (Player) sender;
        player.setHealth(0);
        return true;
    }
}
