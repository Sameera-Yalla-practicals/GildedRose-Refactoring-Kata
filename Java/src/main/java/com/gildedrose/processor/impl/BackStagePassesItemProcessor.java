package com.gildedrose.processor.impl;

import com.gildedrose.model.Item;
import com.gildedrose.processor.ItemProcessor;
import com.gildedrose.utility.ItemUtils;

/**
 * Processor for updating the quality and sellIn for BackStagePasses items.
 */
public class BackStagePassesItemProcessor implements ItemProcessor {

    /**
     * Each call to processItem represents a daily update.
     * @param item The BackStagePasses item to be processed.
     */
    @Override
    public void processItem(Item item) {
        // The sellIn value decremented by 1 each day.
        ItemUtils.decrementSellIn(item);
        // The Quality value decrements each day and should not be greater than 50.
        if (item.getSellIn() <= 0) {
            item.setQuality(0);
        } else {
            ItemUtils.IncrementQuality(item, getIncrementByValue(item.getSellIn()));
        }
    }
    private static int getIncrementByValue(int sellIn){

        return (sellIn <= 5) ? 3 : (sellIn <= 10) ? 2 : 1;
    }
}
