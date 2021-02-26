package broccolai.inventories.bukkit;

import broccolai.inventories.core.Menu;
import broccolai.inventories.core.MenuManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public final class BukkitMenuManager extends MenuManager<Player, ItemStack> {
    @Override
    public void internal(Player player, Menu<ItemStack, ?> menu) {
        Inventory inventory = Bukkit.createInventory(player, 36);
        menu.items().forEach(inventory::setItem);

        player.openInventory(inventory);
    }
}
