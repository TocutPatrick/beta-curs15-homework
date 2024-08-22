package org.beta.curs15.homework.generics.products;

import org.beta.curs15.homework.generics.Category;
import org.beta.curs15.homework.generics.ShopItem;

public class Electronics implements ShopItem {
    private final String name;
    private final int price;
    private final Category category;

    public Electronics(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Category category() {
        return category;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
