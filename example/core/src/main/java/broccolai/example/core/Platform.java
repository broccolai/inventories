package broccolai.example.core;

import broccolai.inventories.core.MenuManager;

public interface Platform<P, I> {

    default void doSomething(P player) {
        MenuManager<P, I> manager = this.manager();
        manager.show(player, SomeMenu.class);
    }

    MenuManager<P, I> manager();
}
