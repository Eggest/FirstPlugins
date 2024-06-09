package io.github.eggest.firstplugins;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import io.github.eggest.firstplugins.Command.*;

import java.util.logging.Logger;

public final class FirstPlugins extends JavaPlugin {
    public final Logger logger = this.getLogger();

    @Override
    public void onEnable() {
        logger.info("FirstPlugins已启动！！！");
        // 注册Event监听器
        {
            Bukkit.getPluginManager().registerEvents(new Listener(), this);
        }

        // 注册命令
        {
            Bukkit.getPluginCommand("die").setExecutor(new DieCommand());
            Bukkit.getPluginCommand("diamond").setExecutor(new DiamondCommand());
            Bukkit.getPluginCommand("regeneration").setExecutor(new RegenerationCommand());
        }
        // 注册配方
        {
            Crafting.AllCraft();
        }

    }

    @Override
    public void onDisable() {
        logger.info("FirstPlugins已关闭！！！");
        getServer().clearRecipes();
    }
}
