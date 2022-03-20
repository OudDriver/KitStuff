package me.oud.events.player.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import me.oud.events.Extras;


public class ArmorKit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("No Console.");
            return true;
        }

        Player p = (Player) sender;

        ItemStack Helmet = new ItemStack(Material.DIAMOND_HELMET);
        ItemStack ChestPlate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemStack Leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemStack Boots = new ItemStack(Material.DIAMOND_BOOTS);

        Helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        Helmet.addEnchantment(Enchantment.DURABILITY, 3);
        ChestPlate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        ChestPlate.addEnchantment(Enchantment.DURABILITY, 3);
        Leggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        Leggings.addEnchantment(Enchantment.DURABILITY, 3);
        Boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        Boots.addEnchantment(Enchantment.DURABILITY, 3);

        ItemStack Sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemStack Gapple = new ItemStack(Material.GOLDEN_APPLE, 16, (short) 1);
        ItemStack Food = new ItemStack(Material.COOKED_BEEF, 64);
        ItemStack Block = new ItemStack(Material.STONE, 1024 + 512);
        Sword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
        Sword.addEnchantment(Enchantment.DURABILITY, 3);

        PlayerInventory PI = p.getInventory();

        if (command.getName().equalsIgnoreCase("armorkit")) {
            Extras.clearArmor(p);
            PI.clear();
            PI.setHelmet(Helmet);
            PI.setLeggings(Leggings);
            PI.setChestplate(ChestPlate);
            PI.setBoots(Boots);
            PI.setItem(0, Sword);
            PI.setItem(1, Gapple);
            PI.setItem(2, Food);
            PI.addItem(Block);
            p.sendMessage(ChatColor.YELLOW + "Let The Plugin" + ChatColor.RED + " GOD " + ChatColor.YELLOW + "Gives You The" + ChatColor.GREEN + ChatColor.BOLD + " ARMORED KIT!");
        }

        return true;
    }
}