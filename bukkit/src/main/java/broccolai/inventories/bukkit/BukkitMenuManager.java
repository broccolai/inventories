package broccolai.inventories.bukkit;

import broccolai.inventories.core.Menu;
import broccolai.inventories.core.MenuManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.checkerframework.checker.nullness.qual.NonNull;

public final class BukkitMenuManager extends MenuManager<Player, ItemStack> {
    @Override
    public void internal(final @NonNull Player player, final @NonNull Menu<ItemStack, ?> menu) {
        Inventory inventory = Bukkit.createInventory(player, 36);
        menu.items().forEach(inventory::setItem);

        player.openInventory(inventory);
    }
}
