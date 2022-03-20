package me.oud.events.commands.world;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.concurrent.ThreadLocalRandom;

public class Start implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        World PlayerWorld = p.getWorld();
        if (command.getName().equalsIgnoreCase("start")) {
            Bukkit.getServer().broadcastMessage(p.getDisplayName() + " Started The Match!");
            for (Player player : Bukkit.getServer().getOnlinePlayers()) {
                int PosX = ThreadLocalRandom.current().nextInt(-100, 100 + 1);
                int PosZ = ThreadLocalRandom.current().nextInt(-100, 100 + 1);
                Location RandomLoc = new Location(PlayerWorld, PosX, 10, PosZ);
                player.teleport(RandomLoc);

            }
        }
        return true;
    }
}
