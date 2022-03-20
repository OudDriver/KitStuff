package me.oud;

import me.oud.events.player.WelcomeGoodbye;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WelcomeGoodbye(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
