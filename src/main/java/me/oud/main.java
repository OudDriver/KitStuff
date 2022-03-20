package me.oud;

import me.oud.events.player.WelcomeGoodbye;
import me.oud.events.player.commands.ArmorKit;
import org.bukkit.plugin.java.JavaPlugin;


public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WelcomeGoodbye(), this);
        getCommand("armorkit").setExecutor(new ArmorKit());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
