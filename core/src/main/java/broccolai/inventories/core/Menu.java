package broccolai.inventories.core;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public abstract class Menu<I, R extends Registry<I>> {

    private final Map<Integer, I> items = new HashMap<>();
    private final R registry;

    public Menu(final R registry) {
        this.registry = registry;
    }

    public void set(int index, Function<R, I> function) {
        this.items.put(index, function.apply(registry));
    }

    public Map<Integer, I> items() {
        return this.items;
    }
}
