package org.jason.itemsplus.Builders;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemBuilder {

    public ItemStack newItem(Material material, String name, List<String> lore, List<Enchantment> enchants, List<Integer> lvlenchant, ItemFlag flag){
        ItemStack item = new ItemStack(material, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        for (int i = 0; i < enchants.size(); i++){
            for (int j = 0; j < lvlenchant.size(); j++){
                meta.addEnchant(enchants.get(i), lvlenchant.get(j), true);
            }
        }
        meta.addItemFlags(flag);

        item.setItemMeta(meta);

        return item;
    }
}
