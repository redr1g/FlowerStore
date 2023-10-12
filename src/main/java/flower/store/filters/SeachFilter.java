package flower.store.filters;

import flower.store.Item;

public interface SeachFilter {
    boolean match(Item item);
}
