package org.jason.itemsplus.Managers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.jason.itemsplus.Builders.ItemBuilder;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack IronHammer;
    public static ItemStack DiamondHammer;
    public static ItemStack NetheriteHammer;


    public static void init(){

        iron_Hammer();
        diamond_Hammer();
        netherite_Hammer();

    }

    private static void iron_Hammer(){

        List<String> lore = new ArrayList<>();
        lore.add("§9Mine en 3x3");
        lore.add("§cEnchants :");
        lore.add("§eSolidité II");

        List<Enchantment> enchants = new ArrayList<>();
        enchants.add(Enchantment.DURABILITY);

        List<Integer> lvl = new ArrayList<>();
        lvl.add(2);

        IronHammer = new ItemBuilder().newItem(Material.IRON_PICKAXE, "Hammer en fer", lore, enchants, lvl, ItemFlag.HIDE_ENCHANTS);

        ShapedRecipe ironHammer = new ShapedRecipe(NamespacedKey.minecraft("iron_hammer"), IronHammer);
        ironHammer.shape("ABA", "CDC", "ABA");
        ironHammer.setIngredient('A', Material.RAW_IRON_BLOCK);
        ironHammer.setIngredient('B', Material.GOLD_INGOT);
        ironHammer.setIngredient('C', Material.IRON_BARS);
        ironHammer.setIngredient('D', Material.IRON_PICKAXE);

        Bukkit.addRecipe(ironHammer);

    }

    private static void diamond_Hammer(){

        List<String> lore = new ArrayList<>();
        lore.add("§9Mine en 3x3");
        lore.add("§cEnchants :");
        lore.add("§eSolidité 3");
        lore.add("§eEfficacité 3");

        List<Enchantment> enchants = new ArrayList<>();
        enchants.add(Enchantment.DURABILITY);
        enchants.add(Enchantment.DIG_SPEED);

        List<Integer> lvl = new ArrayList<>();
        lvl.add(3);
        lvl.add(3);

        DiamondHammer = new ItemBuilder().newItem(Material.DIAMOND_PICKAXE, "Hammer en diamant", lore, enchants, lvl, ItemFlag.HIDE_ENCHANTS);

        ShapedRecipe diamondHammer = new ShapedRecipe(NamespacedKey.minecraft("diamond_hammer"), DiamondHammer);
        diamondHammer.shape("ABA", "CDC", "ABA");
        diamondHammer.setIngredient('A', Material.WAXED_OXIDIZED_COPPER);
        diamondHammer.setIngredient('B', Material.BLAZE_POWDER);
        diamondHammer.setIngredient('C', Material.DIAMOND);
        diamondHammer.setIngredient('D', Material.DIAMOND_PICKAXE);

        Bukkit.addRecipe(diamondHammer);

    }

    private static void netherite_Hammer(){

        List<String> lore = new ArrayList<>();
        lore.add("§9Mine en 3x3");
        lore.add("§cEnchants :");
        lore.add("§eSolidité 3");
        lore.add("§eEfficacité 4");
        lore.add("§eMending");

        List<Enchantment> enchants = new ArrayList<>();
        enchants.add(Enchantment.DURABILITY);
        enchants.add(Enchantment.DIG_SPEED);
        enchants.add(Enchantment.MENDING);

        List<Integer> lvl = new ArrayList<>();
        lvl.add(3);
        lvl.add(4);
        lvl.add(1);

        NetheriteHammer = new ItemBuilder().newItem(Material.NETHERITE_PICKAXE, "Hammer en netherite", lore, enchants, lvl, ItemFlag.HIDE_ENCHANTS);

        ShapedRecipe netheriteHammer = new ShapedRecipe(NamespacedKey.minecraft("netherite_hammer"), NetheriteHammer);
        netheriteHammer.shape("ABA", "CDC", "ABA");
        netheriteHammer.setIngredient('A', Material.PURPUR_BLOCK);
        netheriteHammer.setIngredient('B', Material.NETHERITE_INGOT);
        netheriteHammer.setIngredient('C', Material.EMERALD_BLOCK);
        netheriteHammer.setIngredient('D', Material.NETHERITE_PICKAXE);

        Bukkit.addRecipe(netheriteHammer);

    }

}
