package broccolai.inventories.core;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public abstract class Menu<I, R extends Registry<I>> {

    private final Map<Integer, I> items = new HashMap<>();
    private final R registry;

    public Menu(final @NonNull R registry) {
        this.registry = registry;
    }

    public final void set(final int index, final @NonNull Function<R, I> function) {
        this.items.put(index, function.apply(this.registry));
    }

    public final @NonNull Map<Integer, I> items() {
        return this.items;
    }
}
