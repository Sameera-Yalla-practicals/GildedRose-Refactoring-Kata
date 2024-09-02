package com.gildedrose.utility;

import com.gildedrose.model.Item;

/**
 * Utility class for calculations
 */
public class ItemUtils {

    public static void decrementSellIn(Item item){
         item.setSellIn(Math.max(0,item.getSellIn() - 1));
    }
    public static void decrementQuality(Item item, int decrementBy){
         item.setQuality(Math.min(50,Math.max(0,item.getQuality() - decrementBy)));
    }
    public static void IncrementQuality(Item item, int incrementBy){
        item.setQuality(Math.min(50,Math.max(0,item.getQuality() + incrementBy)));
    }
}
