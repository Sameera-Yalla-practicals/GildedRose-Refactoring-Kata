package com.gildedrose.processor.impl;

import com.gildedrose.model.Item;
import com.gildedrose.processor.ItemProcessor;
import com.gildedrose.utility.ItemUtils;

/**
 * Processor for updating the quality and sellIn for Aged Brie items.
 */
public class AgedBrieItemProcessor implements ItemProcessor {

    /**
     * Each call to processItem represents a daily update.
     * @param item The Aged Brie item to be processed.
     */
    @Override
    public void processItem(Item item) {
        // The sellIn value decremented by 1 each day.
        ItemUtils.decrementSellIn(item);
        // The Quality value incremented by 2 each day and should not be greater than 50.
        ItemUtils.IncrementQuality(item,2);
    }
}
