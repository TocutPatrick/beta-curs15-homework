package org.beta.curs15.homework.generics;

import org.beta.curs15.homework.generics.products.Clothes;

public class Main {
    public static void main(String[] args) {
        Shop<Clothes> clothesShop = new Shop<>();

        clothesShop.addItem(new Clothes("Tricou", 40, Category.NEW));
        clothesShop.addItem(new Clothes("Jeans", 22, Category.ON_SALE));
        clothesShop.addItem(new Clothes("Hats", 10, Category.ON_SALE));
        clothesShop.addItem(new Clothes("Socks", 40, Category.NEW));


        System.out.println(clothesShop.findByCategory(Category.NEW));
        System.out.println(clothesShop.findByName("tshirt"));

        try {
            System.out.println(clothesShop.removeItem("Socks"));
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
