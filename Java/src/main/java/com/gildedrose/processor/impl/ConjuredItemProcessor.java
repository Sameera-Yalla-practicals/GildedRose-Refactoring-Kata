package com.gildedrose.processor.impl;

import com.gildedrose.model.Item;
import com.gildedrose.processor.ItemProcessor;
import com.gildedrose.utility.ItemUtils;

/**
 * Processor for updating the quality and sellIn for Conjured items.
 */
public class ConjuredItemProcessor implements ItemProcessor {

    /**
     * Each call to processItem represents a daily update.
     * @param item The Conjured item to be processed.
     */
    @Override
    public void processItem(Item item) {
        // The sellIn value decremented by 1 each day.
        ItemUtils.decrementSellIn(item);
        // The Quality value decremented by 2 each day and should not be less than 0.
        ItemUtils.decrementQuality(item,2);
    }
}

