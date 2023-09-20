package org.jason.itemsplus;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.jason.itemsplus.Listeners.HammerEvent;
import org.jason.itemsplus.Managers.ItemManager;

public final class ItemsPlus extends JavaPlugin {

    @Override
    public void onEnable() {

        ItemManager.init();

        PluginManager regEvent = this.getServer().getPluginManager();
        regEvent.registerEvents(new HammerEvent(), this);

    }
}
