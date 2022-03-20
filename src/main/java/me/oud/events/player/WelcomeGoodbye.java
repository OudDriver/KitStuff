package me.oud.events.player;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class WelcomeGoodbye implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        p.sendTitle( ChatColor.GREEN+ "Welcome To " + ChatColor.YELLOW + "Duel!", ChatColor.AQUA + "More Like A God Damn UHC Lnao");
        e.setJoinMessage("§l§b" + p.getDisplayName() + ChatColor.YELLOW + " Has " + ChatColor.GREEN + "JOINED!");
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        e.setQuitMessage("§l§b" + p.getDisplayName() + ChatColor.YELLOW + " Has " + ChatColor.GREEN + "QUITTED!");
    }
}
