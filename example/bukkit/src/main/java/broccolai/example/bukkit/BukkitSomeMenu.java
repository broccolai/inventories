package broccolai.example.bukkit;

import broccolai.example.core.SomeMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class BukkitSomeMenu extends SomeMenu<ItemStack> {
    public BukkitSomeMenu() {
        super(new BukkitSomeRegistry());
    }

    public final static class BukkitSomeRegistry implements SomeRegistry<ItemStack> {

        @Override
        public ItemStack ingot() {
            return new ItemStack(Material.IRON_INGOT);
        }
    }
}
