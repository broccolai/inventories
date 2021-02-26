package broccolai.inventories.core;

import java.util.HashMap;
import java.util.Map;

public abstract class MenuManager<P, I> {

    private final Map<Class<?>, Menu<I, ?>> bindings = new HashMap<>();

    public <T extends Menu<I, ?>> void bind(Class<T> clazz, T object) {
        this.bindings.put(clazz, object);
    }

    public <T extends Menu<I, ?>> void show(P player, Class<T> clazz) {
        Menu<I, ?> menu = this.bindings.get(clazz);
        this.internal(player, menu);
    }

    public abstract void internal(P player, Menu<I, ?> menu);
}
