package com.gildedrose.processor.impl;

import com.gildedrose.model.Item;
import com.gildedrose.processor.ItemProcessor;


/**
 * Processor for updating the quality and sellIn for Sulfuras items.
 */
public class SulfurasItemProcessor implements ItemProcessor {
    /**
     * Each call to processItem represents a daily update.
     * @param item The Sulfuras item quality is fixed.
     */
    @Override
    public void processItem(Item item) {
        item.setQuality(80);
    }
}
