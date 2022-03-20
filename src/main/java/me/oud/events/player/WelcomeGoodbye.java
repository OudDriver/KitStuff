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
        e.setJoinMessage(ChatColor.BOLD + "" + ChatColor.AQUA + p.getDisplayName() + ChatColor.YELLOW + " Has " + ChatColor.GREEN + "JOINED!");
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        e.setQuitMessage(ChatColor.BOLD + "" + ChatColor.AQUA + p.getDisplayName() + ChatColor.YELLOW + " Has " + ChatColor.GREEN + "Quitted!");
    }
}
