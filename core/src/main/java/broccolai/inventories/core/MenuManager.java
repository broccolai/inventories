package broccolai.inventories.core;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.HashMap;
import java.util.Map;

public abstract class MenuManager<P, I> {

    private final Map<Class<?>, Menu<I, ?>> bindings = new HashMap<>();

    public final <T extends Menu<I, ?>> void bind(final @NonNull Class<T> clazz, final @NonNull T object) {
        this.bindings.put(clazz, object);
    }

    public final <T extends Menu<I, ?>> void show(final @NonNull P player, final @NonNull Class<T> clazz) {
        Menu<I, ?> menu = this.bindings.get(clazz);
        this.internal(player, menu);
    }

    public abstract void internal(@NonNull P player, @NonNull Menu<I, ?> menu);
}
