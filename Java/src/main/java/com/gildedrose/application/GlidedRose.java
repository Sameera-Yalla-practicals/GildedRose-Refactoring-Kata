package com.gildedrose.application;

import com.gildedrose.factory.ItemProcessorFactory;
import com.gildedrose.model.Item;
import com.gildedrose.processor.ItemProcessor;

/**
 * It handles daily updates of item.
 */
public class GlidedRose {
    private final ItemProcessorFactory itemProcessorFactory;

    public GlidedRose() {
        this.itemProcessorFactory = new ItemProcessorFactory();
    }

    /**
     * updates quality and sell in values of items according to specific rules.
     * @param items  of type Conjured, Sulfuras, BackStagePasses, AgedBrie.
     */
    public void processItems(Item[] items) {
        for (Item item : items){
              ItemProcessor itemProcessor = itemProcessorFactory.getProcessor(item);
              itemProcessor.processItem(item);
        }
    }
}
