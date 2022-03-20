package me.oud.events.commands.player;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import static me.oud.events.Extras.clearArmor;


public class NonArmorKit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("No Console.");
            return true;
        }

        Player p = (Player) sender;

        ItemStack Helmet = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta HelmetMeta = Helmet.getItemMeta();

        HelmetMeta.addEnchant(Enchantment.DURABILITY, 20, true);
        HelmetMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, false);
        Helmet.setItemMeta(HelmetMeta);



        ItemStack Sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemStack Gapple = new ItemStack(Material.GOLDEN_APPLE, 48, (short) 1);
        ItemStack Food = new ItemStack(Material.COOKED_BEEF, 64);
        ItemStack Block = new ItemStack(Material.STONE, 1024 + 512);
        Sword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
        Sword.addEnchantment(Enchantment.DURABILITY, 3);

        PlayerInventory PI = p.getInventory();

        if (command.getName().equalsIgnoreCase("nonarmorkit")) {
            clearArmor(p);
            PI.clear();
            PI.setHelmet(Helmet);
            PI.setItem(0, Sword);
            PI.setItem(1, Gapple);
            PI.setItem(2, Food);
            PI.addItem(Block);
            p.sendMessage(ChatColor.YELLOW + "Let The Plugin" + ChatColor.RED + " GOD " + ChatColor.YELLOW + "Gives You The" + ChatColor.RED + ChatColor.BOLD + " NON-ARMORED KIT!");
        }

        return true;
    }
}