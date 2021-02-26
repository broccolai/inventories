package broccolai.example.bukkit;

import broccolai.example.core.Platform;
import broccolai.example.core.SomeMenu;
import broccolai.inventories.bukkit.BukkitMenuManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin implements Platform<Player, ItemStack>, Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        this.doSomething(event.getPlayer());
    }

    @Override
    public BukkitMenuManager manager() {
        BukkitMenuManager menuManager = new BukkitMenuManager();
        menuManager.bind(SomeMenu.class, new BukkitSomeMenu());

        return menuManager;
    }
}
