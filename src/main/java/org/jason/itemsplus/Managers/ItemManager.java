package org.jason.itemsplus.Managers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.jason.itemsplus.Builders.ItemBuilder;

import java.util.List;

public class ItemManager {

    public static ItemStack IronHammer;


    public static void init(){

        iron_Hammer();

    }

    private static void iron_Hammer(){

        ItemStack item;

        List<String> lore = null;
        lore.add("§9Mine en 3x3");
        lore.add("§cEnchants :");
        lore.add("§eSolidité II");
        lore.add("§eMending");

        List<Enchantment> enchants = null;
        enchants.add(Enchantment.DURABILITY);

        List<Integer> lvl = null;
        lvl.add(2);

        item = new ItemBuilder().newItem(Material.IRON_PICKAXE, "Hammer en fer", lore, enchants, lvl, ItemFlag.HIDE_ENCHANTS);

        IronHammer = item;

        ShapedRecipe ironHammer = new ShapedRecipe(NamespacedKey.minecraft("Iron_hammer"), IronHammer);
        ironHammer.shape("ABA", "CDC", "ABA");
        ironHammer.setIngredient('A', Material.RAW_IRON_BLOCK);
        ironHammer.setIngredient('B', Material.GOLD_INGOT);
        ironHammer.setIngredient('C', Material.IRON_BARS);
        ironHammer.setIngredient('D', Material.IRON_PICKAXE);

        Bukkit.addRecipe(ironHammer);

    }

    private static void Diamond_Hammer(){

        ItemStack item;

        List<String> lore = null;
        lore.add("§9Mine en 3x3");
        lore.add("§cEnchants :");
        lore.add("§eSolidité 3");
        lore.add("§Efficacité 3");

        List<Enchantment> enchants = null;
        enchants.add(Enchantment.DURABILITY);
        enchants.add(Enchantment.DIG_SPEED);

    }

}
