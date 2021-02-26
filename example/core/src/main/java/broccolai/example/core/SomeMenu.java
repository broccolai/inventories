package broccolai.example.core;

import broccolai.inventories.core.Menu;
import broccolai.inventories.core.Registry;

public class SomeMenu<I> extends Menu<I, SomeMenu.SomeRegistry<I>> {

    public SomeMenu(final SomeRegistry<I> registry) {
        super(registry);
        this.set(1, SomeRegistry::ingot);
    }

    public interface SomeRegistry<I> extends Registry<I> {
        I ingot();
    }
}
