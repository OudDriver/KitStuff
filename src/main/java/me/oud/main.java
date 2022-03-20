package me.oud;

import me.oud.events.commands.player.NonArmorKit;
import me.oud.events.commands.world.Start;
import me.oud.events.player.WelcomeGoodbye;
import me.oud.events.commands.player.ArmorKit;
import org.bukkit.plugin.java.JavaPlugin;


public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WelcomeGoodbye(), this);
        getCommand("armorkit").setExecutor(new ArmorKit());
        getCommand("noarmorkit").setExecutor(new NonArmorKit());
        getCommand("start").setExecutor(new Start());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
