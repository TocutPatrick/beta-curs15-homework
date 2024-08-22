package org.beta.curs15.homework.generics;

import org.beta.curs15.homework.exceptions.ItemNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Shop<T extends ShopItem> {
    private final List<T> items;

    public Shop() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public T removeItem(String name) {
        T result = findByName(name);
        if (result != null) {
            items.remove(result);
        } else throw new ItemNotFoundException("Item not found");
        return result;
    }

    public List<T> findByCategory(Category cat) {
        List<T> list = new ArrayList<>();
        for (T item : items) {
            if (item.category().equals(cat)) {
                list.add(item);
            }
        }
        return list;
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        List<T> list = new ArrayList<>();
        for (T item : items) {
            if (item.price() < maxPrice) {
                list.add(item);
            }
        }
        return list;
    }

    public T findByName(String name) {
        for (T item : items) {
            if (item.name().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public int counterByCategory(Category cat) {
        int counter = 0;
        for (T item : items) {
            if (item.category().equals(cat)) {
                counter++;
            }
        }
        return counter;
    }
}
