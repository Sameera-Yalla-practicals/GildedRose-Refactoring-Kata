package com.gildedrose.main;

import com.gildedrose.Exception.InvalidItemTypeException;
import com.gildedrose.application.GlidedRose;
import com.gildedrose.model.Item;

public class Application {

    public static void main(String[] args) {

        GlidedRose glidedRose = new GlidedRose();
        try {
            Item[] items = new Item[]{
                Item.builder().name("Conjured").sellIn(15).quality(30).build(),
                Item.builder().name("Sulfuras").sellIn(0).quality(30).build(),
                Item.builder().name("BackStagePasses").sellIn(2).quality(30).build(),
                Item.builder().name("BackStagePasses").sellIn(5).quality(30).build(),
                Item.builder().name("BackStagePasses").sellIn(10).quality(30).build(),
                Item.builder().name("BackStagePasses").sellIn(0).quality(30).build(),
                Item.builder().name("AgedBrie").sellIn(10).quality(30).build()
                //Item.builder().name("Aged").sellIn(10).quality(30).build()
            };

            glidedRose.processItems(items);
            for (Item item : items) {
                System.out.println(item);
            }
        }  catch(InvalidItemTypeException invalidItemTypeException){
            System.err.println("Exception: " + invalidItemTypeException.getMessage());
        }
    }
}
